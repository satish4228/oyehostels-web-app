package com.oyehostels.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import com.oyehostels.service.OyeHostelsServiceApplication;
import com.oyehostels.service.user.UserService;


@SpringBootApplication
@ComponentScan(basePackages = {"oyehostels-service","com.oyehostels.*"})
public class OyeHostelsWebApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext= SpringApplication.run(OyeHostelsWebApplication.class, args);
		
	}

}
