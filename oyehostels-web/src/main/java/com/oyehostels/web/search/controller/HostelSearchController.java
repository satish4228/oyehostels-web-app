package com.oyehostels.web.search.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oyehostels.service.bo.hostel.HostelRoomTypeInfoBo;
import com.oyehostels.service.bo.hostel.RatingValueNoOfReviewersBo;
import com.oyehostels.service.bo.solr.HostelResultBo;
import com.oyehostels.service.bo.user.AutoCompleteResultBo;
import com.oyehostels.service.hostel.service.HostelService;
import com.oyehostels.service.solr.service.HostelSearchService;

@RestController
public class HostelSearchController {

	@Autowired
	HostelSearchService hostelSearchService;
	
	@Autowired
	HostelService hostelService;

	@ResponseBody
	@GetMapping("/search-autocomplete.json")
	public Set<AutoCompleteResultBo> getAutoCompleteResult(@RequestParam("searchString") String searchString) {
		return hostelSearchService.getSearchAutoComplete(searchString);
	}

	@ResponseBody
	@GetMapping("/search-hostels.json")
	public List<HostelResultBo> getAutoCompleteResult(@RequestParam("searchBy") String searchBy,
			@RequestParam("hostelGender") String hostelGender, @RequestParam("latLon") String latLon) {
		return hostelSearchService.getSearchHostels(latLon, hostelGender, searchBy);
	}
	
	@ResponseBody
	@GetMapping("/get-rating-and-no-reviewers.json")
	public RatingValueNoOfReviewersBo getRatingAndReviewers(@RequestParam("hostelId") int hostelId){
		return hostelService.getRatingValueAndNoReviewersByHostelId(hostelId);
	}
	
	
	@ResponseBody
	@GetMapping("/hostel-room-type-info.json")
	public List<HostelRoomTypeInfoBo> getRoomTypeInfoByHostelId(@RequestParam("hostelId") int hostelId){
		return hostelService.getHostelTypeInfoByHostelId(hostelId);
	}

}
