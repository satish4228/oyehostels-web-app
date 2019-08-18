package com.oyehostels.service.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.oyehostels.service.entities.HostelRoomTypeInfo;

@Repository
public interface HostelRoomTypeInfoRepository extends JpaRepository<HostelRoomTypeInfo, Integer> {
	
	@Query("from HostelRoomTypeInfo hrti where hrti.hostelId = :hostelId")
	public List<HostelRoomTypeInfo> getRoomTypeInfoByHostelId(@Param("hostelId") int hostelId);
	
	
}
