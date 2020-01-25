package com.b2b.dto;

public class Approval {
	private String tempId;
	private String tempType;
	private String tempName;
	private String tempPass;
	private String tempAddr;
	private String tempPhoneNo;
	private String tempMailId;
	public String getTempId() {
		return tempId;
	}
	public void setTempId(String tempId) {
		this.tempId = tempId;
	}
	public String getTempType() {
		return tempType;
	}
	public void setTempType(String tempType) {
		this.tempType = tempType;
	}
	public String getTempName() {
		return tempName;
	}
	public void setTempName(String tempName) {
		this.tempName = tempName;
	}
	public String getTempPass() {
		return tempPass;
	}
	public void setTempPass(String tempPass) {
		this.tempPass = tempPass;
	}
	public String getTempAddr() {
		return tempAddr;
	}
	public void setTempAddr(String tempAddr) {
		this.tempAddr = tempAddr;
	}
	public String getTempPhoneNo() {
		return tempPhoneNo;
	}
	public void setTempPhoneNo(String tempPhoneNo) {
		this.tempPhoneNo = tempPhoneNo;
	}
	public String getTempMailId() {
		return tempMailId;
	}
	public void setTempMailId(String tempMailId) {
		this.tempMailId = tempMailId;
	}
	public Approval() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Approval(String tempId, String tempType, String tempName, String tempPass, String tempAddr,
			String tempPhoneNo, String tempMailId) {
		super();
		this.tempId = tempId;
		this.tempType = tempType;
		this.tempName = tempName;
		this.tempPass = tempPass;
		this.tempAddr = tempAddr;
		this.tempPhoneNo = tempPhoneNo;
		this.tempMailId = tempMailId;
	}
	
	
	
	
	
}
