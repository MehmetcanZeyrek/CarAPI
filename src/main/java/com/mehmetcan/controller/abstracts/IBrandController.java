package com.mehmetcan.controller.abstracts;

import org.springframework.http.ResponseEntity;

import com.mehmetcan.dto.DtoBrand;

public interface IBrandController {

	
	public ResponseEntity<DtoBrand> saveBrand(DtoBrand newBrand);
	
	public ResponseEntity<DtoBrand> getBrandById(Long id);
}
