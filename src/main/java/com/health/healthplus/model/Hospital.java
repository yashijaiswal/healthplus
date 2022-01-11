package com.health.healthplus.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

@Component
@Entity
@Table(name = "hospital", schema = "healthplus")
public class Hospital {

	@Id
	@GeneratedValue
	@Column(name = "hospital_id")
	private int hospital_id;

	
	@Column(name = "address_id", insertable = false, updatable = false)
	private int address_id;

	@Column(name = "hospital_name")
	private String hospital_name;

	@OneToOne(cascade = CascadeType.ALL, optional = false)
	@JoinColumn(name = "address_id")
	private Address address;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "hospital")
	@JsonIgnore
	private List<SlotAvailability> slotAvailability;

	public int getHospital_id() {
		return hospital_id;
	}

	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}

	public int getAddress_id() {
		return address_id;
	}

	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}

	public String getHospital_name() {
		return hospital_name;
	}

	public void setHospital_name(String hospital_name) {
		this.hospital_name = hospital_name;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<SlotAvailability> getSlotAvailability() {
		return slotAvailability;
	}

	public void setSlotAvailability(List<SlotAvailability> slotAvailability) {
		this.slotAvailability = slotAvailability;
	}

}
