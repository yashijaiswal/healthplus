package com.health.healthplus.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="slot_availability", schema="healthplus")
public class SlotAvailability {
	
	@Id
    @GeneratedValue
    @Column(name="serial_id")
	private int serial_id;
	
	@Column(name="hospital_id", insertable=false, updatable=false)
	private int hospital_id;
	
	@Column(name="doctor_id", insertable=false, updatable=false)
	private int doctor_id;
	
	@Column(name="slot_id", insertable=false, updatable=false)
	private int slot_id;
	
	@Column(name="date")
	private LocalDate date;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "hospital_id")
	private List<Hospital> hospital;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "slot_id")
	private Slots slot;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "doctor_id")
	private Doctor doctor;
	
	public int getSerial_id() {
		return serial_id;
	}
	public void setSerial_id(int serial_id) {
		this.serial_id = serial_id;
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
	public int getSlot_id() {
		return slot_id;
	}
	public void setSlot_id(int slot_id) {
		this.slot_id = slot_id;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	
	public List<Hospital> getHospital() {
		return hospital;
	}
	public void setHospital(List<Hospital> hospital) {
		this.hospital = hospital;
	}
	
	public Slots getSlot() {
		return slot;
	}
	public void setS_id(Slots slot) {
		this.slot = slot;
	}
	
	public Doctor getDoctor() {
		return doctor;
	}
	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}
	
	
}
