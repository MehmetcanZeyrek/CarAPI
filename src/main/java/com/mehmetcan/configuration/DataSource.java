package com.mehmetcan.configuration;

import org.antlr.v4.runtime.misc.TestRig;
import org.hibernate.sql.exec.spi.StandardEntityInstanceResolver;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataSource {
	
	
	private String url;
	
	private String username;

}
