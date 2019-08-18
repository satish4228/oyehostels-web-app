package com.oyehostels.service.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bed_type")
public class BedType implements Serializable{
	private static final long serialVersionUID = 4194966567509338557L;
	
	@Id
	@Column(name = "bed_type_id")
	@GeneratedValue
	protected int BedTypeId;
	
	@Column(name = "bed_type_nm")
	protected String BedTypeName;
	
	@Column(name = "bed_type_description")
	protected String BedTypeDescription;
	
	@Column(name = "created_by")
	protected String createdBy;
	@Column(name = "created_dt")
	protected Date createdDate;
	@Column(name = "last_modified_dt")
	protected Date lastModifiedDate;
	@Column(name = "last_modified_by")
	protected String lastModifiedBy;
	public int getBedTypeId() {
		return BedTypeId;
	}
	public void setBedTypeId(int bedTypeId) {
		BedTypeId = bedTypeId;
	}
	public String getBedTypeName() {
		return BedTypeName;
	}
	public void setBedTypeName(String bedTypeName) {
		BedTypeName = bedTypeName;
	}
	public String getBedTypeDescription() {
		return BedTypeDescription;
	}
	public void setBedTypeDescription(String bedTypeDescription) {
		BedTypeDescription = bedTypeDescription;
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
