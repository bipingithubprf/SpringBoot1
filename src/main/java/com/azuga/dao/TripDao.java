package com.azuga.dao;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.transform.AliasToBeanResultTransformer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.azuga.model.TripCollectionVO;

@Repository
@Transactional
public class TripDao {
	@Autowired
    private SessionFactory sessionFactory;
 
    private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
    
    
    @SuppressWarnings("unchecked")
    public List<TripCollectionVO> getAllTripRecords() {
    	
    	
    	StringBuilder query = new StringBuilder();
    	List<TripCollectionVO> activityReportDataList = new ArrayList<TripCollectionVO>();
		query.append(" SELECT customerId ,tripNumber,tsTime,teTime from trip");
		Query query1 = getSession().createSQLQuery(query.toString());
		activityReportDataList = (List<TripCollectionVO>) query1
				.setResultTransformer(new AliasToBeanResultTransformer(TripCollectionVO.class)).list();
		
	return  activityReportDataList;
        
    }


	public void delete(TripCollectionVO person) {
		// TODO Auto-generated method stub
		
	}


	public void savePerson(TripCollectionVO person) {
		// TODO Auto-generated method stub
		
	}
}
