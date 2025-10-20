package com.mehmetcan;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;


@EnableJpaRepositories(basePackages = "com.alituran")
@ComponentScan(basePackages = "com.alituran")
@EntityScan(basePackages = "com.alituran")
@SpringBootApplication
@EnableScheduling
public class VforvicApplication {

	public static void main(String[] args) {
		SpringApplication.run(VforvicApplication.class, args);
	}
	
	@Bean
	public ModelMapper returnMapper() {
		
		return new ModelMapper();
	}

}
