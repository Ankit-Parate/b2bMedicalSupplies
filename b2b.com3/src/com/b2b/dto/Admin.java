package com.b2b.dto;

public class Admin {
	private int adminId;
	private String adminName;
	private String adminPass;
	public Admin(int adminId, String adminName, String adminPass) {
		super();
		this.adminId = adminId;
		this.adminName = adminName;
		this.adminPass = adminPass;
	}
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPass() {
		return adminPass;
	}
	public void setAdminPass(String adminPass) {
		this.adminPass = adminPass;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}
}
