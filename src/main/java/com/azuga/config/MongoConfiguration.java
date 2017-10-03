package com.azuga.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientOptions;
import com.mongodb.MongoCredential;
import com.mongodb.ReadConcern;
import com.mongodb.ReadPreference;
import com.mongodb.ServerAddress;
import com.mongodb.WriteConcern;

@Configuration
public class MongoConfiguration {

	private static final String REPORT_SERVICE_CONNECTION_FACTORY = "ReportServiceConnectionFactory";
	@Value("${mongodb.server.port}")
	private int port;

	@Value("${mongodb.server.address}")
	private String server;

	@Value("${mongodb.user}")
	private String dbUser;

	@Value("${mongodb.password}")
	private String dbPassword;

	@Value("${mongodb.datasource}")
	private String database;

	@Value("${mongodb.connection.timeout}")
	private int timeoutInterval;

	@Value("${mongodb.connections}")
	private int connections;
	
	
	@Bean
	public MongoDbFactory mongoDbFactory() throws Exception {
	
		MongoCredential mongoCredential = MongoCredential.createScramSha1Credential(dbUser, database,
				dbPassword.toCharArray());
		MongoClientOptions.Builder optionsBuilder = new MongoClientOptions.Builder();
		
		optionsBuilder.connectTimeout(timeoutInterval);// 2000
		optionsBuilder.maxConnectionIdleTime(100000);
		optionsBuilder.connectTimeout(120000);
		optionsBuilder.connectionsPerHost(connections);// 16
		optionsBuilder.description(REPORT_SERVICE_CONNECTION_FACTORY);
		optionsBuilder.heartbeatSocketTimeout(10000);
		optionsBuilder.writeConcern(WriteConcern.ACKNOWLEDGED);
		optionsBuilder.readConcern(ReadConcern.DEFAULT);
		optionsBuilder.readPreference(ReadPreference.primary());
		MongoClientOptions clientOptions = optionsBuilder.build();
		MongoClient mongoClient = new MongoClient(new ServerAddress(server, port), Arrays.asList(mongoCredential),
				clientOptions);
		return new SimpleMongoDbFactory(mongoClient, database);
	}

	@Bean
	public MongoTemplate mongoTemplate() throws Exception {
		 return new MongoTemplate(mongoDbFactory());
		
	}
}
