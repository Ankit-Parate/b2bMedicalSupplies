package com.b2b.dto;

public class Pharmacy {
	private int pharId;
	private String pharName;
	private String pharPass;
	private String pharAddress;
	private String pharMailId;
	
	public Pharmacy() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Pharmacy(int pharId, String pharName, String pharPass, String pharAddress, String pharMailId) {
		super();
		this.pharId = pharId;
		this.pharName = pharName;
		this.pharPass = pharPass;
		this.pharAddress = pharAddress;
		this.pharMailId = pharMailId;
	}

	public int getPharId() {
		return pharId;
	}
	public void setPharId(int pharId) {
		this.pharId = pharId;
	}
	
	public String getPharName() {
		return pharName;
	}
	public void setPharName(String pharName) {
		this.pharName = pharName;
	}
	
	public String getPharPass() {
		return pharPass;
	}
	public void setPharPass(String pharPass) {
		this.pharPass = pharPass;
	}
	public String getPharAddress() {
		return pharAddress;
	}
	public void setPharAddress(String pharAddress) {
		this.pharAddress = pharAddress;
	}
	public String getPharMailId() {
		return pharMailId;
	}
	public void setPharMailId(String pharMailId) {
		this.pharMailId = pharMailId;
	}
}
