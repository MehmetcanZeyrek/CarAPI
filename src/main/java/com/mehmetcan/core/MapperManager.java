package com.mehmetcan.core;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MapperManager implements MapperService {
	
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ModelMapper forRequest() {
		modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy
		(MatchingStrategies.LOOSE);
		return modelMapper;
	}

	@Override
	public ModelMapper forResponse() {
		modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy
		(MatchingStrategies.STANDARD);
		return modelMapper;
	}
	

}
