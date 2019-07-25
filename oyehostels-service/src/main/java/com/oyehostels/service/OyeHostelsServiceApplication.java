package com.oyehostels.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.oyehostels.service.entity.user.SystemUser;
import com.oyehostels.service.repo.user.UserRepository;
import com.oyehostels.service.solr.bo.HostelResultBo;
import com.oyehostels.service.solr.service.HostelSearchService;
import com.oyehostels.service.solr.service.HostelSearchServiceImpl;
import com.oyehostels.service.user.UserService;
import com.oyehostels.web.user.bo.AutoCompleteResultBo;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = UserRepository.class)
@EntityScan(basePackageClasses = SystemUser.class)
public class OyeHostelsServiceApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(OyeHostelsServiceApplication.class, args);
		HostelSearchService hostelSearchService = applicationContext.getBean("hostelSearchService", HostelSearchServiceImpl.class);
		for (AutoCompleteResultBo bo : hostelSearchService.getSearchAutoComplete("Am")) {
			System.out.println(bo);
		}
	}

}
