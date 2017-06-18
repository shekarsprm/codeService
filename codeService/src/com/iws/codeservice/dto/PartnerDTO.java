package com.iws.codeservice.dto;

import java.sql.Timestamp;

public class PartnerDTO {

	private Integer partnerId;
	private String partnerName;
	private String partnerCode;
	private String partnerDesc;
	private boolean status;
	private String createdBy;
	private Timestamp createDateTime;
	private String modifiedBy;
	private Timestamp modifiedDateTime;
	private String partnerPassPhase;
	public Integer getPartnerId() {
		return partnerId;
	}
	public void setPartnerId(Integer partnerId) {
		this.partnerId = partnerId;
	}
	public String getPartnerName() {
		return partnerName;
	}
	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}
	public String getPartnerCode() {
		return partnerCode;
	}
	public void setPartnerCode(String partnerCode) {
		this.partnerCode = partnerCode;
	}
	public String getPartnerDesc() {
		return partnerDesc;
	}
	public void setPartnerDesc(String partnerDesc) {
		this.partnerDesc = partnerDesc;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Timestamp getCreateDateTime() {
		return createDateTime;
	}
	public void setCreateDateTime(Timestamp createDateTime) {
		this.createDateTime = createDateTime;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getModifiedDateTime() {
		return modifiedDateTime;
	}
	public void setModifiedDateTime(Timestamp modifiedDateTime) {
		this.modifiedDateTime = modifiedDateTime;
	}
	public String getPartnerPassPhase() {
		return partnerPassPhase;
	}
	public void setPartnerPassPhase(String partnerPassPhase) {
		this.partnerPassPhase = partnerPassPhase;
	}
	
	
}
