package com.oyehostels.service.solr.config;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.solr.core.SolrTemplate;
import org.springframework.data.solr.repository.config.EnableSolrRepositories;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
public class SolrConfig {

	@Value("${spring.data.solr.host}")
	private String solrURL;

	@Bean
	public SolrClient solrClient() {
		return new HttpSolrClient.Builder(solrURL).build();
	}
	
	@Bean
	public SolrTemplate solrTemplate(SolrClient client) throws Exception {
		return new SolrTemplate(client);
	}
}
