package com.health.healthplus.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.health.healthplus.model.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {
	
	List<Account> findByUsername(String name);

}
