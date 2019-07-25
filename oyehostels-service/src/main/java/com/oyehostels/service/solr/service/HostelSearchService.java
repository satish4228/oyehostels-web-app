package com.oyehostels.service.solr.service;

import java.util.Set;

import com.oyehostels.web.user.bo.AutoCompleteResultBo;

public interface HostelSearchService {
	public Set<AutoCompleteResultBo> getSearchAutoComplete(String text);
}
