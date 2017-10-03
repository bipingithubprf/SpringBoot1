package com.azuga.service;

import java.util.List;

import com.azuga.model.TripCollectionVO;

public interface MongoOperationService {

	void saveToCollection(List<TripCollectionVO> ms);

}
