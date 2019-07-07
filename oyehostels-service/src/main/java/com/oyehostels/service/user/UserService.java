package com.oyehostels.service.user;

import org.springframework.stereotype.Service;

public interface UserService {
	public String validateUser(String email,String password);
	
	public String registerUser(String email,String password,String phoneNumber,String firstName,String lastName, String gender);
	
}
