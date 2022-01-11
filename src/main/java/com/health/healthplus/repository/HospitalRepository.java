package com.health.healthplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.health.healthplus.model.Hospital;

@Repository
public interface HospitalRepository extends JpaRepository<Hospital, Long> {
	
	/*
	 * @Query(value =
	 * "select * from healthplus.Hospital h join healthplus.Address a on (h.address_id= a.address_id) where a.city=:city"
	 * , nativeQuery = true) List<Hospital> findHospitalByCity(String city);
	 */

}
