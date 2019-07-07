package com.oyehostels.service.user.mapper;

import org.springframework.stereotype.Component;

import com.oyehostels.service.entity.user.SystemUser;
import com.oyehostels.web.user.bo.SystemUserBo;

@Component
public class UserMapper {
	
	public SystemUser mapToSystemuser(SystemUserBo systemUserBo) {
		SystemUser systemUser = new SystemUser();
		systemUser.setEmail(systemUserBo.getEmail());
		systemUser.setPassword(systemUserBo.getPassword());
		systemUser.setPhoneNumber(systemUserBo.getPhoneNumber());
		systemUser.setFirstName(systemUserBo.getFirstName());
		systemUser.setLastName(systemUserBo.getLastName());
		systemUser.setGender(systemUserBo.getGender());
		systemUser.setStatus(systemUserBo.getStatus());
		systemUser.setCreatedBy(systemUserBo.getCreatedBy());
		systemUser.setCreatedDate(systemUserBo.getCreatedDate());
		systemUser.setLastModifiedBy(systemUserBo.getLastModifiedBy());
		systemUser.setLastModifiedDate(systemUserBo.getLastModifiedDate());
		return systemUser;
	}
}
