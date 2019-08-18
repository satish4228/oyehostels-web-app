package com.oyehostels.service.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "hostel_rating")
@Entity
public class HostelRating implements Serializable{
	
	
	private static final long serialVersionUID = -6447258622872491600L;
	
	@Id
	@Column(name = "hostel_rating_id")
	@GeneratedValue
	protected int hostelRatingId;
	
	@Column(name = "hostel_id")
	protected int hostelId;
	
	@Column(name = "rating_user_id")
	protected int ratingUserId;
	@Column(name = "rating_value")
	protected float ratingValue;
	@Column(name = "created_by")
	protected String createdBy;
	@Column(name = "created_dt")
	protected Date createdDate;
	@Column(name = "last_modified_dt")
	protected Date lastModifiedDate;
	@Column(name = "last_modified_by")
	protected String lastModifiedBy;
	
	public int getHostelRatingId() {
		return hostelRatingId;
	}
	public void setHostelRatingId(int hostelRatingId) {
		this.hostelRatingId = hostelRatingId;
	}
	public int getHostelId() {
		return hostelId;
	}
	public void setHostelId(int hostelId) {
		this.hostelId = hostelId;
	}
	public int getRatingUserId() {
		return ratingUserId;
	}
	public void setRatingUserId(int ratingUserId) {
		this.ratingUserId = ratingUserId;
	}
	public float getRatingValue() {
		return ratingValue;
	}
	public void setRatingValue(float ratingValue) {
		this.ratingValue = ratingValue;
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
