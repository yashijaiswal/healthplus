package com.health.healthplus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.healthplus.model.Hospital;
import com.health.healthplus.repository.HospitalRepository;

@Service
public class HospitalServiceImpl implements HospitalService {
	
	@Autowired
	HospitalRepository hospitalRepository;
	
	public List<Hospital> searchHospital(String city){
		//return hospitalRepository.findHospitalByCity(city);
		return hospitalRepository.findAll();
		
	}


}
