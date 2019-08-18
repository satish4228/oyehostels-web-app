package com.oyehostels.service.solr.service;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.solr.core.SolrCallback;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.stereotype.Service;

import com.oyehostels.service.bo.hostel.RatingValueNoOfReviewersBo;
import com.oyehostels.service.bo.solr.HostelResultBo;
import com.oyehostels.service.bo.user.AutoCompleteResultBo;
import com.oyehostels.service.repo.UserRepository;
import com.oyehostels.service.util.OyeHostelConstants;

@Service("hostelSearchService")
public class HostelSearchServiceImpl implements HostelSearchService{
	
	@Autowired
	SolrTemplate solrTemplate;
	
	
	final String citySFeild = "cityLatLon";
	final String localitySFeild = "localityLatLon";
	final String hostelSFeild = "addressLatLon";
	Set<AutoCompleteResultBo> autoCompleteResultBos = null;
	AutoCompleteResultBo autoCompleteResultBo = null;
	
	public Set<AutoCompleteResultBo> getSearchAutoComplete(String searchString){
		final SolrQuery solrQuery = new SolrQuery();
		final String searchWords[] = searchString.split(" ");
		String convertedSearchString = searchStringConversion(searchWords);
		//set the query parameters
		solrQuery.set("df", "cityName");
		solrQuery.set("dfType", "edismax");
		solrQuery.set("q", convertedSearchString);
		solrQuery.set("qf", "cityName^4.0 countryName^1.0");
		List<HostelResultBo> autoCompleteResult = solrTemplate.execute(new SolrCallback<List<HostelResultBo>>() {

			@Override
			public List<HostelResultBo> doInSolr(SolrClient solrClient) throws SolrServerException, IOException {
				final QueryResponse queryResponse = solrClient.query(solrQuery);
				final List<HostelResultBo> results = solrTemplate.convertQueryResponseToBeans(queryResponse,
						HostelResultBo.class);
				return results;
			}
			
		});
		
		//adding values to the autoCompleteResult
		autoCompleteResultBos = new LinkedHashSet<AutoCompleteResultBo>();
		for (HostelResultBo hostelResultBo : autoCompleteResult) {
			autoCompleteResultBo = new AutoCompleteResultBo();
			autoCompleteResultBo.setUpperText(hostelResultBo.getCityName());
			autoCompleteResultBo.setDownText(hostelResultBo.getCountryName());
			autoCompleteResultBo.setLatLon(hostelResultBo.getCityLatLon());
			autoCompleteResultBo.setIdentity(OyeHostelConstants.AUTO_COMPLETE_CITY_SUGG_IDENTITY);
			autoCompleteResultBos.add(autoCompleteResultBo);
		}
		
		
		if(autoCompleteResult.size() <= 10) {
			List<HostelResultBo> localityResult = getLocalityAutoComplete(convertedSearchString);
			
			for (HostelResultBo hostelResultBo : localityResult) {
				autoCompleteResultBo = new AutoCompleteResultBo();
				autoCompleteResultBo.setUpperText(hostelResultBo.getLocalityName());
				autoCompleteResultBo.setDownText(hostelResultBo.getCityName());
				autoCompleteResultBo.setLatLon(hostelResultBo.getLocalityLatLon());
				autoCompleteResultBo.setIdentity(OyeHostelConstants.AUTO_COMPLETE_LOCALITY_SUGG_IDENTITY);
				autoCompleteResultBos.add(autoCompleteResultBo);
			}
			autoCompleteResult.addAll(localityResult);
			
		}
		
		if(autoCompleteResult.size() <= 10) {
			List<HostelResultBo> hostelResult = getHostelAutoComplete(convertedSearchString);
			
			
			for (HostelResultBo hostelResultBo : hostelResult) {
				autoCompleteResultBo = new AutoCompleteResultBo();
				autoCompleteResultBo.setUpperText(hostelResultBo.getHostelName());
				autoCompleteResultBo.setDownText(hostelResultBo.getLocalityName());
				autoCompleteResultBo.setLatLon(hostelResultBo.getAddressLatLon());
				autoCompleteResultBo.setIdentity(OyeHostelConstants.AUTO_COMPLETE_HOSTEL_SUGG_IDENTITY);
				autoCompleteResultBos.add(autoCompleteResultBo);
			}
			autoCompleteResult.addAll(hostelResult);
			
		}
		
		return autoCompleteResultBos;
	}
	
	
	//method for retriving the hostel seaarch result
	@Override
	public List<HostelResultBo> getSearchHostels(String latLon, String gender,String searchBy) {
		final SolrQuery solrQuery = new SolrQuery();
		solrQuery.set("q", "*:*");
		if(searchBy.equalsIgnoreCase("city")) {
			solrQuery.set("sfield", "cityLatLon");
			solrQuery.set("d", "60");
		}else if(searchBy.equalsIgnoreCase("locality")) {
			solrQuery.set("sfield", "localityLatLon");
			solrQuery.set("d", "15");
		}else if(searchBy.equalsIgnoreCase("hostel")) {
			solrQuery.set("sfield", "addressLatLon");
			solrQuery.set("d", "5");
		}
		solrQuery.set("pt", latLon);
		solrQuery.set("fl", "*,dist:geodist()");
		solrQuery.set("fq", "(hostelGender:" + gender + ")AND{!bbox}");
		solrQuery.set("sort", "geodist() asc");
		
		List<HostelResultBo> hostelResultBos = solrTemplate.execute(new SolrCallback<List<HostelResultBo>>() {

			@Override
			public List<HostelResultBo> doInSolr(SolrClient solrClient) throws SolrServerException, IOException {
				final QueryResponse queryResponse = solrClient.query(solrQuery);
				final List<HostelResultBo> results = solrTemplate.convertQueryResponseToBeans(queryResponse,
						HostelResultBo.class);
				return results;
			}
			
		});
		
		return hostelResultBos;
	}
	
	
	
	//method for getting localityName as auto-complete
	public List<HostelResultBo> getLocalityAutoComplete(String convertedSearchString){
		final SolrQuery solrQuery = new SolrQuery();
		solrQuery.set("df", "localityName");
		solrQuery.set("dfType", "edismax");
		solrQuery.set("q", "localityName:" + convertedSearchString + " OR cityName:" + convertedSearchString);
		solrQuery.set("qf", "localityName^4.0 cityName^1.0");
		List<HostelResultBo> autoCompleteCityResult = solrTemplate.execute(new SolrCallback<List<HostelResultBo>>() {

			@Override
			public List<HostelResultBo> doInSolr(SolrClient solrClient) throws SolrServerException, IOException {
				final QueryResponse queryResponse = solrClient.query(solrQuery);
				final List<HostelResultBo> results = solrTemplate.convertQueryResponseToBeans(queryResponse,
						HostelResultBo.class);
				return results;
			}
			
		});

		return autoCompleteCityResult;
	}
	


	//method for getting the hostel-name as autocomplete
	public List<HostelResultBo> getHostelAutoComplete(String convertedSearchString){
		final SolrQuery solrQuery = new SolrQuery();
		solrQuery.set("df", "hostelName");
		solrQuery.set("dfType", "edismax");
		solrQuery.set("q", "hostelName:" + convertedSearchString + " OR localityName:" + convertedSearchString);
		solrQuery.set("qf", "hostelName^4.0 localityName^1.0");
		List<HostelResultBo> autoCompleteHostelResult = solrTemplate.execute(new SolrCallback<List<HostelResultBo>>() {

			@Override
			public List<HostelResultBo> doInSolr(SolrClient solrClient) throws SolrServerException, IOException {
				final QueryResponse queryResponse = solrClient.query(solrQuery);
				final List<HostelResultBo> results = solrTemplate.convertQueryResponseToBeans(queryResponse,
						HostelResultBo.class);
				return results;
			}
			
		});

		return autoCompleteHostelResult;
	}
	
	
	
	
	
	
	// searchString Conversion Logic
	private String searchStringConversion(String[] searchWords) {

		String result = "";
		String quotationAppender = "\\\"";
		String orSymbol = " || ";

		for (int i = 0; i < searchWords.length; i++) {

			if (i == searchWords.length - 1) {
				result += quotationAppender + searchWords[i] + quotationAppender;
			} else {
				result += quotationAppender + searchWords[i] + quotationAppender + orSymbol;
				;
			}
		}

		return result;
	}
	
}
