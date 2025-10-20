package com.mehmetcan.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class GlobalConfiguration {

	
	@Value(value = "${spring.datasource.url}")
	private String url;
	
	@Value(value = "${spring.datasource.username}")
	private String username;
	
}
