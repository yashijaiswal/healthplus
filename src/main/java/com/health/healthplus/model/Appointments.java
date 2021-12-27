package com.health.healthplus.model;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="appointments", schema="healthplus")
public class Appointments {
	
	@Id
    @GeneratedValue
	@Column(name="appt_id")
	private int appt_id;
	
	@Column(name="user_id")
	private int user_id;
	
	@Column(name="date_appt")
	private LocalDate date_appt;
	
	@Column(name="time_appt")
	private LocalTime time_appt;
	
	@Column(name="hospital_id")
	private int hospital_id;
	
	@Column(name="doctor_id")
	private int doctor_id;
	
	public int getAppt_id() {
		return appt_id;
	}
	public void setAppt_id(int appt_id) {
		this.appt_id = appt_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public LocalDate getDate_appt() {
		return date_appt;
	}
	public void setDate_appt(LocalDate date_appt) {
		this.date_appt = date_appt;
	}
	public LocalTime getTime_appt() {
		return time_appt;
	}
	public void setTime_appt(LocalTime time_appt) {
		this.time_appt = time_appt;
	}
	public int getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
	}
	

}
