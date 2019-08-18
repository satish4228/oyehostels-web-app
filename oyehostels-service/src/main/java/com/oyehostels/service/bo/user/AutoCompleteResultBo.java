package com.oyehostels.service.bo.user;

public class AutoCompleteResultBo {
	public String upperText;
	public String downText;
	public String latLon;
	public String identity;
	
	public String getUpperText() {
		return upperText;
	}
	public void setUpperText(String upperText) {
		this.upperText = upperText;
	}
	public String getDownText() {
		return downText;
	}
	public void setDownText(String downText) {
		this.downText = downText;
	}
	public String getLatLon() {
		return latLon;
	}
	public void setLatLon(String latLon) {
		this.latLon = latLon;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String identity) {
		this.identity = identity;
	}
	@Override
	public String toString() {
		return "AutoCompleteResultBo [upperText=" + upperText + ", downText=" + downText + ", latLon=" + latLon + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((downText == null) ? 0 : downText.hashCode());
		result = prime * result + ((latLon == null) ? 0 : latLon.hashCode());
		result = prime * result + ((upperText == null) ? 0 : upperText.hashCode());
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
		AutoCompleteResultBo other = (AutoCompleteResultBo) obj;
		if (downText == null) {
			if (other.downText != null)
				return false;
		} else if (!downText.equals(other.downText))
			return false;
		if (latLon == null) {
			if (other.latLon != null)
				return false;
		} else if (!latLon.equals(other.latLon))
			return false;
		if (upperText == null) {
			if (other.upperText != null)
				return false;
		} else if (!upperText.equals(other.upperText))
			return false;
		return true;
	}
	
	
	
}
