package com.health.healthplus.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.JsonNode;
import com.health.healthplus.model.Account;
import com.health.healthplus.model.Users;
import com.health.healthplus.service.UserServiceImpl;

@RestController
@Component
public class UsersController {

	@Autowired
	private UserServiceImpl userService;

	@GetMapping(path = "/")
	public String welcome() {
		return "Application is Up and Running";
	}

	@PostMapping(path = "/addUser")
	public String addUser(@RequestBody JsonNode userJson) {
		
		String username = userJson.get("username").asText();
		String password = userJson.get("password").asText();
		String email = userJson.get("email").asText();
		DateTimeFormatter createDateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		LocalDateTime created_on = LocalDateTime.parse(userJson.get("created_on").asText(), createDateFormatter);
		LocalDateTime last_login = LocalDateTime.parse(userJson.get("last_login").asText(), createDateFormatter);
		
		Account acc = new Account();
		acc.setCreatedOn(created_on);
		acc.setEmail(email);
		acc.setLastLogin(last_login);
		acc.setPassword(password);
		acc.setUsername(username);
		
		int id = userService.addAccount(acc);
		
		String firstname = userJson.get("firstname").asText();
		String lastname = userJson.get("lastname").asText();
		String gender = userJson.get("gender").asText();
		int age = userJson.get("age").asInt();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate dob = LocalDate.parse(userJson.get("dob").asText(), formatter);
		String address = userJson.get("address").asText();
		long contactNum = userJson.get("contact").asLong();
		
		Users user = new Users();
		user.setAddress(address);
		user.setAge(age);
		user.setContactNum(contactNum);
		user.setDob(dob);
		user.setFirstname(firstname);
		user.setGender(gender);
		user.setLastname(lastname);
		user.setAccId(id);
		
		int userId = userService.addUser(user);
		
		
		return "User with userId " + userId +  " created Successfully";
 	}


	@PostMapping(path = "/validateUser")
	public String validateUser(@RequestBody JsonNode accJson) {
		String username = accJson.get("username").asText();
		String password = accJson.get("password").asText();
		boolean b = userService.validateUser(username, password);
		if (b==true)
			return "Welcome " + username;
		else
			return "Incorrect username/password";
	}

}
