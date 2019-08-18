package com.oyehostels.service.bo.solr;

public class HostelResultBo {
	protected String hostelId;
	protected String hostelName;
	protected String hostelGender;
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

	public String getHostelGender() {
		return hostelGender;
	}

	public void setHostelGender(String hostelGender) {
		this.hostelGender = hostelGender;
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((AddressLine1 == null) ? 0 : AddressLine1.hashCode());
		result = prime * result + ((AddressLine2 == null) ? 0 : AddressLine2.hashCode());
		result = prime * result + ((addressLatLon == null) ? 0 : addressLatLon.hashCode());
		result = prime * result + ((cityLatLon == null) ? 0 : cityLatLon.hashCode());
		result = prime * result + ((cityName == null) ? 0 : cityName.hashCode());
		result = prime * result + ((countryLatLon == null) ? 0 : countryLatLon.hashCode());
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((hostelGender == null) ? 0 : hostelGender.hashCode());
		result = prime * result + ((hostelId == null) ? 0 : hostelId.hashCode());
		result = prime * result + ((hostelName == null) ? 0 : hostelName.hashCode());
		result = prime * result + ((landmark == null) ? 0 : landmark.hashCode());
		result = prime * result + ((localityLatLon == null) ? 0 : localityLatLon.hashCode());
		result = prime * result + ((localityName == null) ? 0 : localityName.hashCode());
		result = prime * result + ((pincode == null) ? 0 : pincode.hashCode());
		result = prime * result + ((stateLatLon == null) ? 0 : stateLatLon.hashCode());
		result = prime * result + ((stateName == null) ? 0 : stateName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HostelResultBo other = (HostelResultBo) obj;
		if (AddressLine1 == null) {
			if (other.AddressLine1 != null)
				return false;
		} else if (!AddressLine1.equals(other.AddressLine1))
			return false;
		if (AddressLine2 == null) {
			if (other.AddressLine2 != null)
				return false;
		} else if (!AddressLine2.equals(other.AddressLine2))
			return false;
		if (addressLatLon == null) {
			if (other.addressLatLon != null)
				return false;
		} else if (!addressLatLon.equals(other.addressLatLon))
			return false;
		if (cityLatLon == null) {
			if (other.cityLatLon != null)
				return false;
		} else if (!cityLatLon.equals(other.cityLatLon))
			return false;
		if (cityName == null) {
			if (other.cityName != null)
				return false;
		} else if (!cityName.equals(other.cityName))
			return false;
		if (countryLatLon == null) {
			if (other.countryLatLon != null)
				return false;
		} else if (!countryLatLon.equals(other.countryLatLon))
			return false;
		if (countryName == null) {
			if (other.countryName != null)
				return false;
		} else if (!countryName.equals(other.countryName))
			return false;
		if (hostelGender == null) {
			if (other.hostelGender != null)
				return false;
		} else if (!hostelGender.equals(other.hostelGender))
			return false;
		if (hostelId == null) {
			if (other.hostelId != null)
				return false;
		} else if (!hostelId.equals(other.hostelId))
			return false;
		if (hostelName == null) {
			if (other.hostelName != null)
				return false;
		} else if (!hostelName.equals(other.hostelName))
			return false;
		if (landmark == null) {
			if (other.landmark != null)
				return false;
		} else if (!landmark.equals(other.landmark))
			return false;
		if (localityLatLon == null) {
			if (other.localityLatLon != null)
				return false;
		} else if (!localityLatLon.equals(other.localityLatLon))
			return false;
		if (localityName == null) {
			if (other.localityName != null)
				return false;
		} else if (!localityName.equals(other.localityName))
			return false;
		if (pincode == null) {
			if (other.pincode != null)
				return false;
		} else if (!pincode.equals(other.pincode))
			return false;
		if (stateLatLon == null) {
			if (other.stateLatLon != null)
				return false;
		} else if (!stateLatLon.equals(other.stateLatLon))
			return false;
		if (stateName == null) {
			if (other.stateName != null)
				return false;
		} else if (!stateName.equals(other.stateName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "HostelResultBo [hostelId=" + hostelId + ", hostelName=" + hostelName + ", hostelGender=" + hostelGender
				+ ", AddressLine1=" + AddressLine1 + ", AddressLine2=" + AddressLine2 + ", landmark=" + landmark
				+ ", pincode=" + pincode + ", addressLatLon=" + addressLatLon + ", localityName=" + localityName
				+ ", localityLatLon=" + localityLatLon + ", cityName=" + cityName + ", cityLatLon=" + cityLatLon
				+ ", stateName=" + stateName + ", stateLatLon=" + stateLatLon + ", countryName=" + countryName
				+ ", countryLatLon=" + countryLatLon + "]";
	}

	



}
