package com.oyehostels.service.hostel.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oyehostels.service.bo.hostel.HostelRoomTypeInfoBo;
import com.oyehostels.service.bo.hostel.RatingValueNoOfReviewersBo;
import com.oyehostels.service.entities.HostelRoomTypeInfo;
import com.oyehostels.service.repo.HostelRatingRepository;
import com.oyehostels.service.repo.HostelRoomTypeInfoRepository;

@Service("hostelService")
public class HostelServiceImpl implements HostelService {
	
	@Autowired
	HostelRatingRepository hostelRatingRepository;
	
	@Autowired
	HostelRoomTypeInfoRepository hostelRoomTypeInfoRepository;

	// method for getting the rating of the hostel by hostelId
	@Override
	public RatingValueNoOfReviewersBo getRatingValueAndNoReviewersByHostelId(int hostelId) {
		String da = hostelRatingRepository.getRatingAndNoOfReviewers(hostelId);
		List<String> data = Arrays.asList(da.split(","));
		
		RatingValueNoOfReviewersBo ratingValueNoOfReviewersBo = new RatingValueNoOfReviewersBo();
		ratingValueNoOfReviewersBo.setNoOfReviewers(data.get(1).toString());
		ratingValueNoOfReviewersBo.setRatingValue(data.get(0).toString());
		return ratingValueNoOfReviewersBo;

	}

	@Override
	public List<HostelRoomTypeInfoBo> getHostelTypeInfoByHostelId(int hostelId) {
		List<HostelRoomTypeInfo> hostelRoomTypeInfos = null;
		List<HostelRoomTypeInfoBo> hostelRoomTypeInfoBos = null;
		HostelRoomTypeInfoBo hostelRoomTypeInfoBo = null;
		
		hostelRoomTypeInfoBos = new ArrayList<HostelRoomTypeInfoBo>();
		hostelRoomTypeInfos = hostelRoomTypeInfoRepository.getRoomTypeInfoByHostelId(hostelId);
		for (HostelRoomTypeInfo hostelRoomTypeInfo : hostelRoomTypeInfos) {
			hostelRoomTypeInfoBo = new HostelRoomTypeInfoBo();
			hostelRoomTypeInfoBo.setHostelRoomTypeInfoId(hostelRoomTypeInfo.getHostelRoomTypeInfoId());
			hostelRoomTypeInfoBo.setHostelId(hostelRoomTypeInfo.getHostelId());
			hostelRoomTypeInfoBo.setHostelRoomTypeName(hostelRoomTypeInfo.getHostelRoomTypeId().getRoomTypeName());
			hostelRoomTypeInfoBo.setTotalBeds(hostelRoomTypeInfo.getTotalBeds());
			hostelRoomTypeInfoBo.setAvaliableBeds(hostelRoomTypeInfo.getAvaliableBeds());
			hostelRoomTypeInfoBo.setRoomPricePerMonth(hostelRoomTypeInfo.getRoomPricePerMonth());
			hostelRoomTypeInfoBo.setBedTypeName(hostelRoomTypeInfo.getBedTypeId().getBedTypeName());
			hostelRoomTypeInfoBo.setBedTypeImageId(hostelRoomTypeInfo.getBedTypeImageId());
			hostelRoomTypeInfoBo.setOneDayAccomidation(hostelRoomTypeInfo.isOneDayAccomidation());
			hostelRoomTypeInfoBos.add(hostelRoomTypeInfoBo);
		}
		
		return hostelRoomTypeInfoBos;
	}
	
	
	
	
}
