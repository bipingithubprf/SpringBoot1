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
		query.append(
				" SELECT t1.*, COUNT(pos.id) AS postedSpeedingEvents, SUM(TIME_TO_SEC(TIMEDIFF(speedingEndTime,speedingStartTime))) AS postedSpeedingDuration  FROM (");
		query.append(
				" SELECT  HEX(t.id) id ,vfse.driverSeatBeltPercentage as driverSeatBeltPercentage, tsTime as tsTime, teTime as teTime, tsLat, tsLon,");
		query.append(" teLat, teLon, t.hardCoreBrakeCount as hardcoreBrakingCount, t.vehicleId, ");
		query.append(" dv.deviceId, dv.lastTimezone, dv.tzUpdatedAt,v.assetno as assetno,");
		query.append(
				" distanceTravelled as tripDistance, TIME_TO_SEC(tripIdleTime) as idleTime,  maxSpeed, averageSpeed, fuelConsumed, overSpeedDuration, overSpeedEvents as overSpeedingEvent,");
		query.append(
				" hardBreakingCounts,hardAccelerationCounts, tsLocationStoreId, teLocationStoreId, tsAddress, teAddress, tripTime, stopTime, ");
		query.append(
				" t.createTime as createDateTime, v.cpm as costPerMile, v.name as vehicle, g.name as groupName ,  ls.name as tsLandmarkName , ");
		query.append(
				" v.fuelTypeId,t.tripNumber,t.customerId,t.tsLandmarkId as tripStartLandmarkId, t.teLandmarkId as tripEndLandmarkId , t.consumedAir, le.name as teLandmarkName, u.firstName, u.lastName, t.tollDistance, t.tollCost ,et.exported ");
		query.append(
				" ,GROUP_CONCAT(DISTINCT IF(bm.userName='', CONCAT(b.serialNumber,' (Unassigned)'),bm.userName) SEPARATOR ', <br/>')  as occupants ");
		query.append(" ,GROUP_CONCAT(DISTINCT tag.name SEPARATOR ' , <br/>' ) as tripTags ");
		query.append(",GROUP_CONCAT(DISTINCT trackeeTags.name) AS trackeeTagNames ");
		query.append(" FROM trip as t");
		query.append(" LEFT JOIN exportedTrip AS et ON t.id=et.tripId");
		query.append(" LEFT outer join landmarks as ls on ls.landmarkId=t.tsLandmarkId ");
		query.append(" LEFT outer join landmarks le on le.landmarkId = t.teLandmarkId ");
		query.append(" join trackee as v on v.trackeeId=t.vehicleId ");
		query.append(" join device as dv on dv.deviceId=v.deviceId ");
		query.append(" join groups as g on g.groupId=v.groupId ");
		query.append(
				" LEFT JOIN vehicleFunctionalSignalEvent vfse on vfse.trackeeId=t.vehicleId  and vfse.tripNumber=t.tripNumber ");
		query.append(
				" LEFT JOIN trackeePairingHistory AS tph ON tph.vehicleId = v.trackeeId AND IFNULL(t.teTime - INTERVAL 1 SECOND,t.tsTime) ");
		query.append("BETWEEN tph.startTime AND IFNULL(tph.endTime,NOW())");
		query.append(" LEFT JOIN user AS u ON u.userId = tph.userId ");
		query.append(" LEFT JOIN beaconMessage bm ON bm.trackeeId=t.vehicleId AND bm.eventTime ");
		query.append(" BETWEEN t.tsTime AND t.teTime ");
		query.append(" LEFT JOIN tripTagMapping ttm ON ttm.tripId=t.id and ttm.deleted=0");
		query.append(" LEFT JOIN tag tag ON tag.tagId=ttm.tagId");
		query.append(" LEFT JOIN beacon b ON bm.beaconId=b.beaconId");
		query.append(
				" LEFT JOIN trackeeTagHistory tth ON tth.trackeeId = t.vehicleId AND (t.tsTime BETWEEN tth.startTime AND IFNULL(tth.endTime, NOW()) OR t.teTime BETWEEN tth.startTime AND IFNULL(tth.endTime, NOW()))");
		query.append(" LEFT JOIN tag as trackeeTags ON trackeeTags.tagId = tth.tagId ");
		query.append(" WHERE ");
		query.append("  (et.applicationId =  2   OR et.applicationId is null ) ");
		query.append(" GROUP by t.id ) t1 ");
		query.append(" LEFT JOIN postedOverSpeedingEvent pos ON pos.vehicleId = t1.vehicleId AND pos.time ");
		query.append(" BETWEEN t1.tsTime AND t1.teTime GROUP BY t1.id ");
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
