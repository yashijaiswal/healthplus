package com.health.healthplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.health.healthplus.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Integer> {

//	@Query(value = "select d.* from healthplus.slots s join healthplus.slot_availability sa on (s.slot_id = sa.slot_id) join healthplus.doctor d on (sa.doctor_id = d.doctor_id)", nativeQuery = true)
//	List<Doctor> findSlotByDoctor_Id(int doctor_id);

}