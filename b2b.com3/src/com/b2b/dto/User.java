package com.b2b.dto;

public class User {
	private int userId;
	private String userName;
	private String userType;
	private String userPass;
	public String getUserPass() {
		return userPass;
	}
	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserType() {
		return userType;
	}
	public void setUserType(String userType) {
		this.userType = userType;
	}
	public User(int userId, String userName, String userType, String userPass) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userType = userType;
		this.userPass = userPass;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
