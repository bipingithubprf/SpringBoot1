package com.azuga;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;


import com.azuga.dao.TripDao;
import com.azuga.model.TripCollectionVO;
import com.azuga.service.MongoOperationService;
@Configuration
public class ServerStartUpUtil {
	private static final Logger log = 
			   LoggerFactory.getLogger(ServerStartUpUtil.class);
	@Autowired
	private TripDao tripDao;
	@Autowired
	private MongoOperationService mongoOperationService;
	
	 @EventListener(ApplicationReadyEvent.class)
	    public void doSomethingAfterStartup() {
	     log.info("hello bipin, I have just started up");
	     System.out.println(tripDao.getAllTripRecords().toString());
	     List<TripCollectionVO> ms=tripDao.getAllTripRecords();
	     mongoOperationService.saveToCollection(ms);
	   }
}
