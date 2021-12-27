package com.health.healthplus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.health.healthplus.model.Users;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {

}
