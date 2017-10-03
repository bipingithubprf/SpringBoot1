package com.azuga;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.PropertySource;

import com.azuga.dao.TripDao;

@SpringBootApplication
@PropertySource("classpath:application.properties")
/*@EnableAutoConfiguration(exclude = { DataSourceAutoConfiguration.class,
	       HibernateJpaAutoConfiguration.class,
	       DataSourceTransactionManagerAutoConfiguration.class })*/
public class PracticeApplication {
	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
		
	}
}
