package com.health.healthplus.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table(name="healthpackages", schema="healthplus")
public class Healthpackages {
	
	@Id
    @GeneratedValue
	@Column(name="package_id")
	private int package_id;
	
	@Column(name="package_name")
	private String package_name;
	
	@Column(name="description")
	private String description;
	
	@Column(name="price")
	private double price;	
	
	@Column(name="hospital_id")
	private int hospital_id;
	
	public int getPackage_id() {
		return package_id;
	}
	public void setPackage_id(int package_id) {
		this.package_id = package_id;
	}
	public String getPackage_name() {
		return package_name;
	}
	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getHospital_id() {
		return hospital_id;
	}
	public void setHospital_id(int hospital_id) {
		this.hospital_id = hospital_id;
	}
	
	

}
