package com.vikram.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user",schema = "myshopping")
public class User {
	
	@Id
	@Column(name="id")
	private int id;
	
	@Column(name = "first_name")
	private String firstName="";
	
	@Column(name = "last_name")
	private String lastName="";
	
	@Column(name = "email_id")
	private String emailId="";
	
	@Column(name = "password")
	private String password="";
	
	@Column(name = "phone_number")
	private String phoneNumber="";
	
	@Column(name = "address")
	private String address="";
	
	@Override
	public String toString() {
		return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId
				+ ", password=" + password + ", phoneNumber=" + phoneNumber + ", address="
				+ address + "]";
	}
	
	public User() {
		
	}
	public User(String firstName, String lastName, String emailId, String password, String phoneNumber,
			String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		
		this.password = password;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
