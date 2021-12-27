package com.health.healthplus.service;

import com.health.healthplus.model.Account;
import com.health.healthplus.model.Users;


public interface UserService {
	
	public int addUser(Users user);
	public int addAccount(Account acc);
	public boolean validateUser(String username, String password);
	
	
}
