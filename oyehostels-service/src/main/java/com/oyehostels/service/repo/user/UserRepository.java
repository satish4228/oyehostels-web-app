package com.oyehostels.service.repo.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oyehostels.service.entity.user.SystemUser;

@Repository
public interface UserRepository extends JpaRepository<SystemUser, Integer> {
	
	//method for getting user entity from email
	@Query("select su from SystemUser su where su.email = :email")
	public SystemUser findSystemUserByEmail(@Param("email") String email);

	
	
	
}
