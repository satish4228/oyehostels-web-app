package com.oyehostels.service.user;

import java.sql.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oyehostels.service.constants.OyeConstants;
import com.oyehostels.service.entity.user.SystemUser;
import com.oyehostels.service.repo.user.UserRepository;
import com.oyehostels.service.user.mapper.UserMapper;
import com.oyehostels.web.user.bo.SystemUserBo;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	UserMapper userMapper;

	@Override
	public String validateUser(String email, String password) {
		SystemUser systemUser = userRepository.findSystemUserByEmail(email);
		if (systemUser != null) {
			if (systemUser.getEmail().equals(email) && systemUser.getPassword().equals(password)) {
				return "true";
			} else {
				return "false";
			}
		} else {
			return "user not registred";
		}
	}

	@Override
	public String registerUser(String email, String password, String phoneNumber, String firstName, String lastName, String gender) {
		String response = null;

		// Date conversions
		java.util.Date utilDate = new java.util.Date();
		java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());

		SystemUserBo systemUserBo = new SystemUserBo();
		systemUserBo.setEmail(email);
		systemUserBo.setPassword(password);
		systemUserBo.setPhoneNumber(phoneNumber);
		systemUserBo.setFirstName(firstName);
		systemUserBo.setLastName(lastName);
		systemUserBo.setGender(gender);
		systemUserBo.setStatus(OyeConstants.STATUS_ACTIVE);
		systemUserBo.setCreatedBy(firstName);
		systemUserBo.setCreatedDate(sqlDate);
		systemUserBo.setLastModifiedBy(email);
		systemUserBo.setLastModifiedDate(sqlDate);
		try {
			userRepository.save(userMapper.mapToSystemuser(systemUserBo));
			response = "true";

		} catch (Exception e) {
			response = "false";
		}

		return response;
	}

}
