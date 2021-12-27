package com.health.healthplus.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.healthplus.model.Account;
import com.health.healthplus.model.Users;
import com.health.healthplus.repository.AccountRepository;
import com.health.healthplus.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	AccountRepository accRepository;

	@Override
	public int addUser(Users user) {
		Users userEntity = userRepository.save(user);
		return userEntity.getUserId();

	}

	@Override
	public int addAccount(Account acc) {
		Account accEntity = accRepository.save(acc);
		return accEntity.getAccId();
	}

	@Override
	public boolean validateUser(String username, String password) {
		boolean b = false;
		List<Account> accList = accRepository.findByUsername(username);
		if (accList != null && accList.size() != 0) {
			Account acc1 = accList.get(0);
			String pass = acc1.getPassword();
			if (pass.equals(password))
				b = true;
			else
				b = false;
		}
		return b;
	}

}
