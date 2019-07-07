package com.oyehostels.web.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oyehostels.service.user.UserService;

@RestController
public class UserLoginAndRegisterController {

	@Autowired
	UserService userService;

	@ResponseBody
	@GetMapping("/user-login.json")
	public String authenticateUser(@RequestParam("email") String email, @RequestParam("password") String password) {
		String response = null;
		response = userService.validateUser(email, password);
		return response;
	}

	@ResponseBody
	@GetMapping("/user-register.json")
	public String registerUser(@RequestParam("email") String email, @RequestParam("password") String password,
			@RequestParam("phoneNumber") String phoneNumber, @RequestParam("firstName") String firstName,
			@RequestParam("lastName") String lastName, @RequestParam("gender") String gender) {
		String response = null;
		response = userService.registerUser(email, password, phoneNumber, firstName, lastName, gender);
		return response;
	}
}
