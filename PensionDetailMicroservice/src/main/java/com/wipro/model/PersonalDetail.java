package com.wipro.model;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
public class PersonalDetail {	
	
	@Id
	private String id;
	private String firstname;
	private String lastname;
	private String fatherName;	
	private int mobileNumber;
	private String email;                              
	private int aadharNumber;							
	private String dateOfBirth;
	private String residentialAddress;
	private String permanentAddress;
	public PersonalDetail(String id, String firstname, String lastname, String fatherName, int mobileNumber,
			String email, int aadhaarNumber, String dateOfBirth, String residentialAddress,
			String permanentAddress) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.fatherName = fatherName;
		this.mobileNumber = mobileNumber;
		this.email = email;
		this.aadharNumber = aadhaarNumber;
		this.dateOfBirth = dateOfBirth;
		this.residentialAddress = residentialAddress;
		this.permanentAddress = permanentAddress;
	}
	public PersonalDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getAadhaarNumber() {
		return aadharNumber;
	}
	public void setAadhaarNumber(int aadhaarNumber) {
		this.aadharNumber = aadhaarNumber;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(String permanentAddress) {
		this.permanentAddress = permanentAddress;
	}                      
	
	
}
