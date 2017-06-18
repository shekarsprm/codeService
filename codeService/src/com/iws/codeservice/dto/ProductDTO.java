package com.iws.codeservice.dto;

import java.sql.Timestamp;

public class ProductDTO {
	private Integer productId;
	private String productCode;
	private String productName;
	private String prodDesc;
	private boolean status;
	private String createBy;
	private Timestamp createDate;
	private String modifiedBy;
	private Timestamp modifedDate;
	private String campIds[];
	private Integer campaignId;
	private String campaignName;
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProdDesc() {
		return prodDesc;
	}
	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Timestamp getModifedDate() {
		return modifedDate;
	}
	public void setModifedDate(Timestamp modifedDate) {
		this.modifedDate = modifedDate;
	}
	public String[] getCampIds() {
		return campIds;
	}
	public void setCampIds(String[] campIds) {
		this.campIds = campIds;
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
	
	
	

}
