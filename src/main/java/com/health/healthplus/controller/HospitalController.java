package com.health.healthplus.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.health.healthplus.model.Hospital;
import com.health.healthplus.service.HospitalService;

@RestController
@Component
public class HospitalController {
	
	@Autowired
	private HospitalService hospitalService;
	
	@GetMapping("/hospitalByCity")
	public List<Hospital> viewHospital(@RequestParam String city) {
		
		return hospitalService.searchHospital(city);
			
	}

}
