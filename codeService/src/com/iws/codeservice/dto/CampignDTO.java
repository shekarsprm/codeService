package com.iws.codeservice.dto;

import java.sql.Timestamp;

public class CampignDTO {

	private Integer campaignId;
	private String campaignName;
	private String campDescription;
	private Integer shortCode;
	private String keyCode;
	private Timestamp startTime;
	private Timestamp endTime;
	private String allowedPids;
	private Integer partnerId;
	private String partnerName;
	private boolean status;
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public Integer getCampaignId() {
		return campaignId;
	}
	public void setCampaignId(Integer campaignId) {
		this.campaignId = campaignId;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getCampDescription() {
		return campDescription;
	}
	public void setCampDescription(String campDescription) {
		this.campDescription = campDescription;
	}
	public Integer getShortCode() {
		return shortCode;
	}
	public void setShortCode(Integer shortCode) {
		this.shortCode = shortCode;
	}
	public String getKeyCode() {
		return keyCode;
	}
	public void setKeyCode(String keyCode) {
		this.keyCode = keyCode;
	}
	public Timestamp getStartTime() {
		return startTime;
	}
	public void setStartTime(Timestamp startTime) {
		this.startTime = startTime;
	}
	public Timestamp getEndTime() {
		return endTime;
	}
	public void setEndTime(Timestamp endTime) {
		this.endTime = endTime;
	}
	public String getAllowedPids() {
		return allowedPids;
	}
	public void setAllowedPids(String allowedPids) {
		this.allowedPids = allowedPids;
	}
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
	
	
	
	
	
	
}
