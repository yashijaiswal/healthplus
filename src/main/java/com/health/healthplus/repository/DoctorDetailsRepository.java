package com.health.healthplus.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.health.healthplus.model.DoctorDetails;

@Repository
public interface DoctorDetailsRepository extends JpaRepository<DoctorDetails, Long> {
	
	@Query(value = "Select d.first_name, d.last_name, d.gender, d.years_exp, d.qualification, d.designation, d.doctor_id, d.fee, h.hospital_name, a.address_line1, a.address_line2, a.city, a.states, s.slot_time, sa.date from healthplus.Address a join healthplus.Hospital h on (a.address_id = h.address_id) join healthplus.slot_availability sa on (h.hospital_id = sa.hospital_id) join healthplus.Slots s on (sa.slot_id = s.slot_id) join healthplus.Doctor d on (sa.doctor_id = d.doctor_id) where a.city=:city and d.speciality=:speciality and sa.date=:date",  nativeQuery = true)
	List<DoctorDetails> getDoctorsListByCity(String city, String speciality, LocalDate date);
	

}
