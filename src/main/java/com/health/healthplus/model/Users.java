package com.health.healthplus.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="users", schema="healthplus")
public class Users {
	
	@Id
    @GeneratedValue
    @Column(name="user_id")
	private int userId;
	
	@Column(name="first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="age")
	private int age;
	
	@Column(name="dob")
	private LocalDate dob;
	
	@Column(name="address")
	private String address;
	
	@Column(name="acc_id")
	private int accId;
	
	@Column(name="contact_num")
	private long contactNum;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAccId() {
		return accId;
	}

	public void setAccId(int accId) {
		this.accId = accId;
	}

	public long getContactNum() {
		return contactNum;
	}

	public void setContactNum(long contactNum) {
		this.contactNum = contactNum;
	}
	
	
	

}