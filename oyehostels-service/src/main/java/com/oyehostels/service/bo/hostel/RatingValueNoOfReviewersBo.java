package com.oyehostels.service.bo.hostel;

import java.io.Serializable;

public class RatingValueNoOfReviewersBo implements Serializable {

	private static final long serialVersionUID = 1L;
	public String ratingValue;
	public String noOfReviewers;
	
	public String getRatingValue() {
		return ratingValue;
	}
	public void setRatingValue(String ratingValue) {
		this.ratingValue = ratingValue;
	}
	public String getNoOfReviewers() {
		return noOfReviewers;
	}
	public void setNoOfReviewers(String noOfReviewers) {
		this.noOfReviewers = noOfReviewers;
	}
	
}
