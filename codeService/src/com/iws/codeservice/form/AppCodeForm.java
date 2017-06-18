package com.iws.codeservice.form;

public class AppCodeForm {

	private  String campName;
	private String productName;
	private String clientId;
	private String clientCode;
	private String appCode;
	private String msisdn;
	private String shortCode;
	private String username;
	private String password;
	private String inpFied01;
	private String inpFied02;
	private String transId;
	public String getCampName() {
		return campName;
	}
	public void setCampName(String campName) {
		this.campName = campName;
	}
	
	
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientCode() {
		return clientCode;
	}
	public void setClientCode(String clientCode) {
		this.clientCode = clientCode;
	}
	public String getAppCode() {
		return appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getShortCode() {
		return shortCode;
	}
	public void setShortCode(String shortCode) {
		this.shortCode = shortCode;
	}
	public String getInpFied01() {
		return inpFied01;
	}
	public void setInpFied01(String inpFied01) {
		this.inpFied01 = inpFied01;
	}
	public String getInpFied02() {
		return inpFied02;
	}
	public void setInpFied02(String inpFied02) {
		this.inpFied02 = inpFied02;
	}
	public String getTransId() {
		return transId;
	}
	public void setTransId(String transId) {
		this.transId = transId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "AppCodeForm [campName=" + campName + ", productName=" + productName + ", clientId=" + clientId
				+ ", clientCode=" + clientCode + ", appCode=" + appCode + ", msisdn=" + msisdn + ", shortCode="
				+ shortCode + ", username=" + username + ", password=" + password + ", inpFied01=" + inpFied01
				+ ", inpFied02=" + inpFied02 + ", transId=" + transId + "]";
	}
	
	
	
	
	
}
