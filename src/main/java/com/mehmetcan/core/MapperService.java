package com.mehmetcan.core;

import org.modelmapper.ModelMapper;

public interface MapperService {

	ModelMapper forRequest();
	
	
	ModelMapper forResponse();
	
	
	
	
}
