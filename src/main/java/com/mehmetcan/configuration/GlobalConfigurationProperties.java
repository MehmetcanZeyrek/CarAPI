package com.mehmetcan.configuration;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@ConfigurationProperties(prefix = "app")
@Data
@Component
public class GlobalConfigurationProperties {

	
	private List<Server> servers;
}
