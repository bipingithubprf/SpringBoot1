package com.azuga.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;


import com.azuga.model.TripCollectionVO;

@Service("mongoOperationService")
public class MongoOperationServiceImpl implements MongoOperationService{
	@Autowired
	private MongoTemplate mongotemplate;

	@Override
	public void saveToCollection(List<TripCollectionVO> ms) {
		Map<Long, List<TripCollectionVO>> ms1=getCollectionToTripVOListMapping(ms);
		for (Map.Entry<Long, List<TripCollectionVO>> entry : ms1.entrySet()) {
			mongotemplate.save(entry.getValue(),entry.getKey().toString());
			}
	}
	
	private Map<Long, List<TripCollectionVO>> getCollectionToTripVOListMapping(
			List<TripCollectionVO> tripCollection) {
		Map<Long, List<TripCollectionVO>> collectionToTripVOListMapping = new HashMap<>();
		for (TripCollectionVO tripCollectionVO : tripCollection) {
			collectionToTripVOListMapping.computeIfAbsent(tripCollectionVO.getCustomerId(), k -> new ArrayList<>()).add(tripCollectionVO);
		}
		return collectionToTripVOListMapping;
	}
}
