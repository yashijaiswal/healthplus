package com.health.healthplus.service;

import java.time.LocalDate;
import java.util.List;

import com.health.healthplus.model.Doctor;
import com.health.healthplus.model.DoctorDetails;

public interface DoctorService{
	
	public List<DoctorDetails> searchDoctor(String city, String speciality, LocalDate date);
	//public List<Doctor> getDoctorSlotByDoctorId(int doctor_id);

}
