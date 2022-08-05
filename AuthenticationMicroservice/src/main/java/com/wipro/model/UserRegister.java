package com.wipro.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRegister{

	@Id
	private String userName;
	private String password;
	private String fullName;
	private int phoneNumber;
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRegister(String fullName, int phoneNumber, String userName, String password) {
		super();
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.userName = userName;
		this.password = password;
	}
	public UserRegister() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
