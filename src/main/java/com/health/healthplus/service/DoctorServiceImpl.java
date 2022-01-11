package com.health.healthplus.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.healthplus.model.Doctor;
import com.health.healthplus.model.DoctorDetails;
import com.health.healthplus.repository.DoctorDetailsRepository;
import com.health.healthplus.repository.DoctorRepository;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Autowired
	DoctorRepository doctorRepository;
	
	@Autowired
	DoctorDetailsRepository doctorDetailsRepository;

	public List<DoctorDetails> searchDoctor(String city, String speciality, LocalDate date) {
		return doctorDetailsRepository.getDoctorsListByCity(city, speciality, date);
	}

	/*
	 * public List<Doctor> getDoctorSlotByDoctorId(int doctor_id) { //return
	 * doctorRepository.findSlotByDoctor_Id(doctor_id); return
	 * doctorRepository.findAll();
	 * 
	 * }
	 */

}
