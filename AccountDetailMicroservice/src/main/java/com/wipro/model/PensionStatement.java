package com.wipro.model;

public class PensionStatement {

	private String date;
	private String fullName;
	private String accountNumber;
	private String accountType;
	private String balance;
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getBalance() {
		return balance;
	}
	public void setBalance(String balance) {
		this.balance = balance;
	}
	public PensionStatement(String date, String fullName, String accountNumber, String accountType, String balance) {
		super();
		this.date = date;
		this.fullName = fullName;
		this.accountNumber = accountNumber;
		this.accountType = accountType;
		this.balance = balance;
	}
	public PensionStatement() {
		super();
		// TODO Auto-generated constructor stub
	}
}
