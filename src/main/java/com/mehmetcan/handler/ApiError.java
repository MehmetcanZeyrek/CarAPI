package com.mehmetcan.handler;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiError <T>{

	private int status;
	
	private T data;
	
	private String path;
	
	private String hostName;
}
