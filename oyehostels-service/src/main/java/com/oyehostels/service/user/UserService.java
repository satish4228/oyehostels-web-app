package com.oyehostels.service.user;

import org.springframework.stereotype.Service;

public interface UserService {
	public String validateUser(String email,String password);
}
