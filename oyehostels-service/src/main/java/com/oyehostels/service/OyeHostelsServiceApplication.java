package com.oyehostels.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.oyehostels.service.bo.solr.HostelResultBo;
import com.oyehostels.service.entities.BedType;
import com.oyehostels.service.entities.HostelRating;
import com.oyehostels.service.entities.HostelRoomTypeInfo;
import com.oyehostels.service.entities.RoomType;
import com.oyehostels.service.entities.SystemUser;
import com.oyehostels.service.repo.HostelRatingRepository;
import com.oyehostels.service.repo.UserRepository;
import com.oyehostels.service.solr.service.HostelSearchService;
import com.oyehostels.service.solr.service.HostelSearchServiceImpl;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {UserRepository.class,HostelRatingRepository.class,HostelRatingRepository.class})
@EntityScan(basePackageClasses = {SystemUser.class,HostelRating.class,HostelRoomTypeInfo.class,RoomType.class,BedType.class})
public class OyeHostelsServiceApplication {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = SpringApplication.run(OyeHostelsServiceApplication.class, args);
		HostelSearchService hostelSearchService = applicationContext.getBean("hostelSearchService", HostelSearchServiceImpl.class);
		for (HostelResultBo bo : hostelSearchService.getSearchHostels("17.38500000,78.48670000", "Male", "city")) {
			System.out.println(bo);
		}
	}

}
