package com.health.healthplus.service;

import java.util.List;

import com.health.healthplus.model.Hospital;

public interface HospitalService {
	
	public List<Hospital> searchHospital(String city);

}
