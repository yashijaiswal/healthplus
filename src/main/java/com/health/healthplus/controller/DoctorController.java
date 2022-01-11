package com.health.healthplus.controller;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.health.healthplus.model.Appointments;
import com.health.healthplus.model.Doctor;
import com.health.healthplus.model.DoctorDetails;
import com.health.healthplus.service.DoctorServiceImpl;

@RestController
@Component
public class DoctorController {
	
	@Autowired
	private DoctorServiceImpl doctorService;
	
	@GetMapping("/doctorByCityAndSpecialityAndDate")
	public List<DoctorDetails> viewDoctor(@RequestParam String city, @RequestParam String speciality,  @RequestParam String date) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ddate = LocalDate.parse(date, formatter);		
		return doctorService.searchDoctor(city, speciality, ddate);
			
	}
	
	@PostMapping(path = "/addBooking")
	public String addBooking(@RequestBody JsonNode bookingDetails ) {
		int userId = bookingDetails.get("userId").asInt();
		DateTimeFormatter createDateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter createTimeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");		
		LocalTime slotTime = LocalTime.parse(bookingDetails.get("slot_time").asText(), createTimeFormatter);
		LocalDate date = LocalDate.parse(bookingDetails.get("date").asText(), createDateFormatter);
		int doctorId = bookingDetails.get("doctorId").asInt();
		int hospitalId = bookingDetails.get("hospitalId").asInt();
		
		Appointments app = new Appointments();
		app.setDate_appt(date);
		app.setDoctor_id(doctorId);
		app.setHospital_id(hospitalId);
		app.setTime_appt(slotTime);
		app.setUser_id(userId);
		
		return "Booking with userId " + userId +  " created Successfully";
	}
	
	/*
	 * @GetMapping("/getDoctorSlotByDoctorId") public List<Doctor>
	 * getDoctorSlotByDoctorId(@RequestParam int doctor_id) { return
	 * doctorService.getDoctorSlotByDoctorId(doctor_id); }
	 */

}
