package com.oyehostels.service.bo.hostel;

public class HostelRoomTypeInfoBo {
	protected int hostelRoomTypeInfoId;

	protected int hostelId;

	protected String hostelRoomTypeName;
	
	protected int roomPricePerMonth;

	protected int totalBeds;

	protected int avaliableBeds;

	protected String bedTypeName;

	protected int bedTypeImageId;

	protected boolean isOneDayAccomidation;

	
	
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

	public String getHostelRoomTypeName() {
		return hostelRoomTypeName;
	}

	public void setHostelRoomTypeName(String hostelRoomTypeName) {
		this.hostelRoomTypeName = hostelRoomTypeName;
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

	public String getBedTypeName() {
		return bedTypeName;
	}

	public void setBedTypeName(String bedTypeName) {
		this.bedTypeName = bedTypeName;
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
	
	

}
