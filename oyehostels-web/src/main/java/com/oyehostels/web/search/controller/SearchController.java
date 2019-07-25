package com.oyehostels.web.search.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.oyehostels.service.solr.service.HostelSearchService;
import com.oyehostels.web.user.bo.AutoCompleteResultBo;

@RestController
public class SearchController {

	@Autowired
	HostelSearchService hostelSearchService;
	
	@ResponseBody
	@GetMapping("/search-autocomplete.json")
	public Set<AutoCompleteResultBo> getAutoCompleteResult(@RequestParam("searchString") String searchString){
		return hostelSearchService.getSearchAutoComplete(searchString);
	}
	
}
