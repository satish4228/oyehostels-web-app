package com.oyehostels.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oyehostels.service.entity.user.SystemUser;
import com.oyehostels.service.repo.user.UserRepository;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Override
	public String validateUser(String email, String password) {
		SystemUser systemUser = userRepository.findSystemUserByEmail(email);
		if(systemUser != null) {
			if(systemUser.getEmail().equals(email) && systemUser.getPassword().equals(password)) {
				return "true";
			}else {
				return "false";
			}
		}else {
			return "user not registred";
		}
	}

}
