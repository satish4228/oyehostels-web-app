package com.oyehostels.service.hostel.service;

import java.util.List;

import com.oyehostels.service.bo.hostel.HostelRoomTypeInfoBo;
import com.oyehostels.service.bo.hostel.RatingValueNoOfReviewersBo;

public interface HostelService {
	public RatingValueNoOfReviewersBo getRatingValueAndNoReviewersByHostelId(int hostelId);
	
	public List<HostelRoomTypeInfoBo> getHostelTypeInfoByHostelId(int hostelId);
}
