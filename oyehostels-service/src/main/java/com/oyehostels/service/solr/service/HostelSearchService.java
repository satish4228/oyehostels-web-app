package com.oyehostels.service.solr.service;

import java.util.List;
import java.util.Set;

import com.oyehostels.service.bo.hostel.RatingValueNoOfReviewersBo;
import com.oyehostels.service.bo.solr.HostelResultBo;
import com.oyehostels.service.bo.user.AutoCompleteResultBo;

public interface HostelSearchService {
	
	public Set<AutoCompleteResultBo> getSearchAutoComplete(String text);
	
	public List<HostelResultBo> getSearchHostels(String latLon, String gender,String searchBy);
	
}
