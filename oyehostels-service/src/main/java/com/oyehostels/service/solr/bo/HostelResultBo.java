package com.oyehostels.service.solr.bo;

import org.springframework.data.solr.core.mapping.SolrDocument;

public class HostelResultBo {
	protected String hostelId;
	protected String hostelName;
	protected String AddressLine1;
	protected String AddressLine2;
	protected String landmark;
	protected String pincode;
	protected String addressLatLon;
	protected String localityName;
	protected String localityLatLon;
	protected String cityName;
	protected String cityLatLon;
	protected String stateName;
	protected String stateLatLon;
	protected String countryName;
	protected String countryLatLon;
	
	
	public String getHostelId() {
		return hostelId;
	}
	public void setHostelId(String hostelId) {
		this.hostelId = hostelId;
	}
	public String getHostelName() {
		return hostelName;
	}
	public void setHostelName(String hostelName) {
		this.hostelName = hostelName;
	}
	public String getAddressLine1() {
		return AddressLine1;
	}
	public void setAddressLine1(String addressLine1) {
		AddressLine1 = addressLine1;
	}
	public String getAddressLine2() {
		return AddressLine2;
	}
	public void setAddressLine2(String addressLine2) {
		AddressLine2 = addressLine2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getAddressLatLon() {
		return addressLatLon;
	}
	public void setAddressLatLon(String addressLatLon) {
		this.addressLatLon = addressLatLon;
	}
	public String getLocalityName() {
		return localityName;
	}
	public void setLocalityName(String localityName) {
		this.localityName = localityName;
	}
	public String getLocalityLatLon() {
		return localityLatLon;
	}
	public void setLocalityLatLon(String localityLatLon) {
		this.localityLatLon = localityLatLon;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getCityLatLon() {
		return cityLatLon;
	}
	public void setCityLatLon(String cityLatLon) {
		this.cityLatLon = cityLatLon;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getStateLatLon() {
		return stateLatLon;
	}
	public void setStateLatLon(String stateLatLon) {
		this.stateLatLon = stateLatLon;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCountryLatLon() {
		return countryLatLon;
	}
	public void setCountryLatLon(String countryLatLon) {
		this.countryLatLon = countryLatLon;
	}
	@Override
	public String toString() {
		return "HostelResultBo [hostelId=" + hostelId + ", hostelName=" + hostelName + ", AddressLine1=" + AddressLine1
				+ ", AddressLine2=" + AddressLine2 + ", landmark=" + landmark + ", pincode=" + pincode
				+ ", addressLatLon=" + addressLatLon + ", localityName=" + localityName + ", localityLatLon="
				+ localityLatLon + ", cityName=" + cityName + ", cityLatLon=" + cityLatLon + ", stateName=" + stateName
				+ ", stateLatLon=" + stateLatLon + ", countryName=" + countryName + ", countryLatLon=" + countryLatLon
				+ "]";
	}
	
	
	
		
}
