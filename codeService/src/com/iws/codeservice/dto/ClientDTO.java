package com.iws.codeservice.dto;

public class ClientDTO {

	private String clientId;
	private String clientName;
	private String clientApiKeyCode;
	private Integer status;
	public String getClientId() {
		return clientId;
	}
	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public String getClientApiKeyCode() {
		return clientApiKeyCode;
	}
	public void setClientApiKeyCode(String clientApiKeyCode) {
		this.clientApiKeyCode = clientApiKeyCode;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "ClientDTO [clientId=" + clientId + ", clientName=" + clientName + ", clientApiKeyCode="
				+ clientApiKeyCode + ", status=" + status + "]";
	}
	
	
	
}
