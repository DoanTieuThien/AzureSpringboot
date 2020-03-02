package com.its.azure.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.its.azure.filter.AzureFilter;

@Configuration
public class AzureConfiguration {

	@Bean
	public Filter azureFilter() {
		return new AzureFilter();
	}
}
