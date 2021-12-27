package com.health.healthplus.model;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="doctor", schema="healthplus")
public class Doctor {
	
	@Id
    @GeneratedValue
    @Column(name="doctor_id")
	private int doctor_id;
    
    @Column(name="first_name")
	private String firstName;
    
    @Column(name="last_name")
	private String lastName;
    
    @Column(name="gender")
	private String gender;
    
    @Column(name="years_exp")
	private int years_exp;
    
    @Column(name="qualification")
	private String qualification;
    
    @Column(name="speciality")
	private String speciality;
    
    @Column(name="description")
	private String description;
    
    @Column(name="designation")
	private String designation;
    
    @Column(name="fee")
	private int fee;
    
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "slot_id")
	private List<SlotAvailability> slotAvailability;
	
	public int getDoctor_id() {
		return doctor_id;
	}
	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getYears_exp() {
		return years_exp;
	}
	public void setYears_exp(int years_exp) {
		this.years_exp = years_exp;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getFee() {
		return fee;
	}
	public void setFee(int fee) {
		this.fee = fee;
	}
	
	public List<SlotAvailability> getSlotAvailability() {
		return slotAvailability;
	}
	public void setSlotAvailability(List<SlotAvailability> slotAvailability) {
		this.slotAvailability = slotAvailability;
	}
	
	
	

}
