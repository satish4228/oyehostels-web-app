package com.oyehostels.service.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;

@Table(name = "hostel_room_type_info")
@Entity
public class HostelRoomTypeInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name = "hostel_room_type_info_id")
	protected int hostelRoomTypeInfoId;

	@Column(name = "hostel_id")
	protected int hostelId;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hostel_room_type_id")
	protected RoomType hostelRoomTypeId;
	
	@Column(name = "room_price_per_month")
	protected int roomPricePerMonth;

	@Column(name = "total_beds")
	protected int totalBeds;

	@Column(name = "avaliable_beds")
	protected int avaliableBeds;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bed_type_id")
	protected BedType bedTypeId;

	@Column(name = "bed_type_image_id")
	protected int bedTypeImageId;

	@Column(name = "is_one_day_accomedation")
	protected boolean isOneDayAccomidation;

	@Column(name = "created_by")
	protected String createdBy;
	@Column(name = "created_dt")
	protected Date createdDate;
	@Column(name = "last_modified_dt")
	protected Date lastModifiedDate;
	@Column(name = "last_modified_by")
	protected String lastModifiedBy;
	
	
	

	public int getRoomPricePerMonth() {
		return roomPricePerMonth;
	}

	public void setRoomPricePerMonth(int roomPricePerMonth) {
		this.roomPricePerMonth = roomPricePerMonth;
	}

	public int getHostelRoomTypeInfoId() {
		return hostelRoomTypeInfoId;
	}

	public void setHostelRoomTypeInfoId(int hostelRoomTypeInfoId) {
		this.hostelRoomTypeInfoId = hostelRoomTypeInfoId;
	}

	public int getHostelId() {
		return hostelId;
	}

	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}


	public int getTotalBeds() {
		return totalBeds;
	}

	public void setTotalBeds(int totalBeds) {
		this.totalBeds = totalBeds;
	}

	public int getAvaliableBeds() {
		return avaliableBeds;
	}

	public void setAvaliableBeds(int avaliableBeds) {
		this.avaliableBeds = avaliableBeds;
	}

	
	public RoomType getHostelRoomTypeId() {
		return hostelRoomTypeId;
	}

	public void setHostelRoomTypeId(RoomType hostelRoomTypeId) {
		this.hostelRoomTypeId = hostelRoomTypeId;
	}

	public BedType getBedTypeId() {
		return bedTypeId;
	}

	public void setBedTypeId(BedType bedTypeId) {
		this.bedTypeId = bedTypeId;
	}

	public int getBedTypeImageId() {
		return bedTypeImageId;
	}

	public void setBedTypeImageId(int bedTypeImageId) {
		this.bedTypeImageId = bedTypeImageId;
	}

	public boolean isOneDayAccomidation() {
		return isOneDayAccomidation;
	}

	public void setOneDayAccomidation(boolean isOneDayAccomidation) {
		this.isOneDayAccomidation = isOneDayAccomidation;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate() {
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}

	public String getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(String lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}

}
