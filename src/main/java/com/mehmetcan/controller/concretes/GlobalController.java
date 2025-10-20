package com.mehmetcan.controller.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmetcan.configuration.DataSource;
import com.mehmetcan.configuration.GlobalConfiguration;
import com.mehmetcan.configuration.GlobalConfigurationProperties;
import com.mehmetcan.configuration.Server;

@RestController
@RequestMapping(path = "/rest/api")
public class GlobalController {
	
	@Autowired
	private GlobalConfiguration globalConfiguration;
	
	@Autowired
	private GlobalConfigurationProperties globalConfigurationProperties;
	
	
	@GetMapping(path = "/global")
	public ResponseEntity<DataSource> getGlobalController(){
		DataSource dataSource = new DataSource();
		dataSource.setUrl(globalConfiguration.getUrl());
		dataSource.setUsername(globalConfiguration.getUsername());
		return ResponseEntity.ok(dataSource);
	}	

	
	@GetMapping(path = "/globalproperty")
	public ResponseEntity<List<Server>> getPropertyController(){
		return ResponseEntity.ok(globalConfigurationProperties.getServers());
	}

}
