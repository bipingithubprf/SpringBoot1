package com.azuga.model;

/**
 * 
 */


import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import javax.persistence.Id;




/**
 * @author bipin
 *
 */
@Entity
@Document(collection="TRIP")
public class TripCollectionVO  implements Cloneable {

	@Id
	private String id;
	@Field
	private Integer postedSpeedingEvents;
	@Field
	private Integer postedSpeedingDuration;
	@Field
	private Byte driverSeatBeltPercentage;
	@Field
	private Double tsLat;
	@Field
	private Double tsLon;
	@Field
	private Double teLat;
	@Field
	private Double teLon;
	@Field
	private Timestamp tsTime;
	@Field
	private Timestamp teTime;
	@Field
	private String vehicleId;
	@Field
	private String deviceId;
	@Field
	private String lastTimezone;
	@Field
	private Timestamp tzUpdatedAt;
	@Field
	private String assetno;
	@Field
	private Double tripDistance;
	@Field
	private String idleTime;
	@Field
	private Integer maxSpeed;
	@Field
	private Integer averageSpeed;
	@Field
	private Double fuelConsumed;
	@Field
	private Integer overSpeedDuration;
	@Field
	private Short hardcoreBrakingCount;
	@Field
	private Integer hardBreakingCounts;
	@Field
	private Integer overSpeedingEvent;
	@Field
	private Integer hardAccelerationCounts;
	@Field
	private String tsLocationStoreId;
	@Field
	private String teLocationStoreId;
	@Field
	private String tsAddress;
	@Field
	private String teAddress;
	@Field
	private Integer tripTime;
	@Field
	private BigInteger stopTime;
	@Field
	private Timestamp createDateTime;
	@Field
	private Double costPerMile;
	@Field
	private String firstName;
	@Field
	private String lastName;
	@Field
	private String vehicle;
	@Field
	private String groupName;
	@Field
	private String tsLandmarkName;
	@Field
	private String teLandmarkName;
	@Field
	private Byte fuelTypeId;
	@Field
	private Double consumedAir;
	@Field
	private Double tollDistance;
	@Field
	private Double tollCost;
	@Field
	private Boolean exported;
	@Field
	private String occupants;
	@Field
	private String tripTags;
	@Field
	private String trackeeTagNames;
	@Field
	private Integer tripNumber;
	@Field
	private Long customerId;
	@Field
	private String tripStartLandmarkId;
	@Field
	private String tripEndLandmarkId;

	public String getTripStartLandmarkId() {
		return tripStartLandmarkId;
	}

	public void setTripStartLandmarkId(String tripStartLandmarkId) {
		this.tripStartLandmarkId = tripStartLandmarkId;
	}

	public String getTripEndLandmarkId() {
		return tripEndLandmarkId;
	}

	public void setTripEndLandmarkId(String tripEndLandmarkId) {
		this.tripEndLandmarkId = tripEndLandmarkId;
	}

	public Long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Integer customerId) {
		this.customerId = customerId.longValue();
	}

	public Integer getTripNumber() {
		return tripNumber;
	}

	public void setTripNumber(Integer tripNumber) {
		this.tripNumber = tripNumber;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getPostedSpeedingEvents() {
		return postedSpeedingEvents;
	}

	public void setPostedSpeedingEvents(BigInteger postedSpeedingEvents) {
		if (postedSpeedingEvents != null) {
			this.postedSpeedingEvents = postedSpeedingEvents.intValue();
		} else {
			this.postedSpeedingEvents = null;
		}
	}

	public Integer getPostedSpeedingDuration() {
		return postedSpeedingDuration;
	}

	public void setPostedSpeedingDuration(BigDecimal postedSpeedingDuration) {
		if (postedSpeedingDuration != null) {
			this.postedSpeedingDuration = postedSpeedingDuration.intValue();
		} else {
			this.postedSpeedingDuration = null;
		}
	}

	public Byte getDriverSeatBeltPercentage() {
		return driverSeatBeltPercentage;
	}

	public void setDriverSeatBeltPercentage(Byte driverSeatBeltPercentage) {
		this.driverSeatBeltPercentage = driverSeatBeltPercentage;
	}

	public Double getTsLat() {
		return tsLat;
	}

	public void setTsLat(Double tsLat) {
		this.tsLat = tsLat;
	}

	public Double getTsLon() {
		return tsLon;
	}

	public void setTsLon(Double tsLon) {
		this.tsLon = tsLon;
	}

	public Double getTeLat() {
		return teLat;
	}

	public void setTeLat(Double teLat) {
		this.teLat = teLat;
	}

	public Double getTeLon() {
		return teLon;
	}

	public void setTeLon(Double teLon) {
		this.teLon = teLon;
	}

	public Timestamp getTsTime() {
		return tsTime;
	}

	public void setTsTime(Timestamp tsTime) {
		this.tsTime = tsTime;
	}

	public Timestamp getTeTime() {
		return teTime;
	}

	public void setTeTime(Timestamp teTime) {
		this.teTime = teTime;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getLastTimezone() {
		return lastTimezone;
	}

	public void setLastTimezone(String lastTimezone) {
		this.lastTimezone = lastTimezone;
	}

	public Timestamp getTzUpdatedAt() {
		return tzUpdatedAt;
	}

	public void setTzUpdatedAt(Timestamp tzUpdatedAt) {
		this.tzUpdatedAt = tzUpdatedAt;
	}

	public String getAssetno() {
		return assetno;
	}

	public void setAssetno(String assetno) {
		this.assetno = assetno;
	}

	public Double getTripDistance() {
		return tripDistance;
	}

	public void setTripDistance(Double tripDistance) {
		this.tripDistance = tripDistance;
	}

	public String getIdleTime() {
		return idleTime;
	}

	public void setIdleTime(BigInteger idleTime) {
		this.idleTime = idleTime.toString();
	}

	public String getVehicle() {
		return vehicle;
	}

	public void setVehicle(String vehicle) {
		this.vehicle = vehicle;
	}

	public String getGroupName() {
		return groupName;
	}

	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	public Integer getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Integer maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getAverageSpeed() {
		return averageSpeed;
	}

	public void setAverageSpeed(Integer averageSpeed) {
		this.averageSpeed = averageSpeed;
	}

	public Double getFuelConsumed() {
		return fuelConsumed;
	}

	public void setFuelConsumed(Double fuelConsumed) {
		this.fuelConsumed = fuelConsumed;
	}

	public Integer getOverSpeedDuration() {
		return overSpeedDuration;
	}

	public void setOverSpeedDuration(Integer overSpeedDuration) {
		this.overSpeedDuration = overSpeedDuration;
	}

	public Short getHardcoreBrakingCount() {
		return hardcoreBrakingCount;
	}

	public void setHardcoreBrakingCount(Short hardcoreBrakingCount) {
		this.hardcoreBrakingCount = hardcoreBrakingCount;
	}

	public Integer getHardBreakingCounts() {
		return hardBreakingCounts;
	}

	public void setHardBreakingCounts(Integer hardBreakingCounts) {
		this.hardBreakingCounts = hardBreakingCounts;
	}

	public Integer getOverSpeedingEvent() {
		return overSpeedingEvent;
	}

	public void setOverSpeedingEvent(Integer overSpeedingEvent) {
		this.overSpeedingEvent = overSpeedingEvent;
	}

	public Integer getHardAccelerationCounts() {
		return hardAccelerationCounts;
	}

	public void setHardAccelerationCounts(Integer hardAccelerationCounts) {
		this.hardAccelerationCounts = hardAccelerationCounts;
	}

	public String getTsLocationStoreId() {
		return tsLocationStoreId;
	}

	public void setTsLocationStoreId(String tsLocationStoreId) {
		this.tsLocationStoreId = tsLocationStoreId;
	}

	public String getTeLocationStoreId() {
		return teLocationStoreId;
	}

	public void setTeLocationStoreId(String teLocationStoreId) {
		this.teLocationStoreId = teLocationStoreId;
	}

	public String getTsAddress() {
		return tsAddress;
	}

	public void setTsAddress(String tsAddress) {
		this.tsAddress = tsAddress;
	}

	public String getTeAddress() {
		return teAddress;
	}

	public void setTeAddress(String teAddress) {
		this.teAddress = teAddress;
	}

	public Integer getTripTime() {
		return tripTime;
	}

	public void setTripTime(Integer tripTime) {
		this.tripTime = tripTime;
	}

	public BigInteger getStopTime() {
		return stopTime;
	}

	public void setStopTime(BigInteger stopTime) {
		this.stopTime = stopTime;
	}

	public Timestamp getCreateDateTime() {
		return createDateTime;
	}

	public void setCreateDateTime(Timestamp createDateTime) {
		this.createDateTime = createDateTime;
	}

	public Double getCostPerMile() {
		return costPerMile;
	}

	public void setCostPerMile(Double costPerMile) {
		this.costPerMile = costPerMile;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getTsLandmarkName() {
		return tsLandmarkName;
	}

	public void setTsLandmarkName(String tsLandmarkName) {
		this.tsLandmarkName = tsLandmarkName;
	}

	public String getTeLandmarkName() {
		return teLandmarkName;
	}

	public void setTeLandmarkName(String teLandmarkName) {
		this.teLandmarkName = teLandmarkName;
	}

	public Byte getFuelTypeId() {
		return fuelTypeId;
	}

	public void setFuelTypeId(Byte fuelTypeId) {
		this.fuelTypeId = fuelTypeId;
	}

	public Double getConsumedAir() {
		return consumedAir;
	}

	public void setConsumedAir(Double consumedAir) {
		this.consumedAir = consumedAir;
	}

	public Double getTollDistance() {
		return tollDistance;
	}

	public void setTollDistance(Double tollDistance) {
		this.tollDistance = tollDistance;
	}

	public Double getTollCost() {
		return tollCost;
	}

	public void setTollCost(Double tollCost) {
		this.tollCost = tollCost;
	}

	public Boolean getExported() {
		return exported;
	}

	public void setExported(Boolean exported) {
		this.exported = exported;
	}

	public String getOccupants() {
		return occupants;
	}

	public void setOccupants(String occupants) {
		this.occupants = occupants;
	}

	public String getTripTags() {
		return tripTags;
	}

	public void setTripTags(String tripTags) {
		this.tripTags = tripTags;
	}

	public String getTrackeeTagNames() {
		return trackeeTagNames;
	}

	public void setTrackeeTagNames(String trackeeTagNames) {
		this.trackeeTagNames = trackeeTagNames;
	}

	@Override
	public String toString() {
		return "TripCollectionVO [id=" + id + ", postedSpeedingEvents=" + postedSpeedingEvents + ", postedSpeedingDuration="
				+ postedSpeedingDuration + ", driverSeatBeltPercentage=" + driverSeatBeltPercentage + ", tsLat=" + tsLat
				+ ", tsLon=" + tsLon + ", teLat=" + teLat + ", teLon=" + teLon + ", tripStart=" + tsTime + ", tripEnd="
				+ teTime + ", vehicleId=" + vehicleId + ", deviceId=" + deviceId + ", lastTimezone=" + lastTimezone
				+ ", tzUpdatedAt=" + tzUpdatedAt + ", assetno=" + assetno + ", tripDistance=" + tripDistance
				+ ", idleTime="
				+ idleTime + ", maxSpeed=" + maxSpeed + ", averageSpeed=" + averageSpeed + ", fuelConsumed=" + fuelConsumed
				+ ", overSpeedDuration=" + overSpeedDuration + ", hardcoreBrakingCount=" + hardcoreBrakingCount
				+ ", hardBreakingCounts=" + hardBreakingCounts + ", overSpeedingEvent=" + overSpeedingEvent
				+ ", hardAccelerationCounts=" + hardAccelerationCounts + ", tsLocationStoreId=" + tsLocationStoreId
				+ ", teLocationStoreId=" + teLocationStoreId + ", tsAddress=" + tsAddress + ", teAddress=" + teAddress
				+ ", tripTime=" + tripTime + ", stopTime=" + stopTime + ", createDateTime=" + createDateTime
				+ ", costPerMile=" + costPerMile + ", firstName=" + firstName + ", lastName=" + lastName + ", vehicle="
				+ vehicle + ", group=" + groupName + ", tsLandmarkName=" + tsLandmarkName + ", teLandmarkName="
				+ teLandmarkName
				+ ", fuelTypeId=" + fuelTypeId + ", consumedAir=" + consumedAir + ", tollDistance=" + tollDistance
				+ ", tollCost=" + tollCost + ", exported=" + exported + ", occupants=" + occupants + ", tripTags=" + tripTags
				+ ", trackeeTagNames=" + trackeeTagNames + ", tripNumber=" + tripNumber + ", customerId=" + customerId
				+ ", tripStartLandmarkId=" + tripStartLandmarkId + ", tripEndLandmarkId=" + tripEndLandmarkId + "]";
	}

	


}
