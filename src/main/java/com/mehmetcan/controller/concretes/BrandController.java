package com.mehmetcan.controller.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmetcan.controller.abstracts.IBrandController;
import com.mehmetcan.dto.DtoBrand;
import com.mehmetcan.service.abstracts.BrandService;


@RestController
@RequestMapping(path = "/rest/api")
public class BrandController implements IBrandController {

	
	@Autowired
	private BrandService brandService;
	
	@PostMapping(path = "/savebrand")
	@Override
	public ResponseEntity<DtoBrand> saveBrand(@RequestBody DtoBrand newBrand) {	
		
		return ResponseEntity.ok(brandService.saveBrand(newBrand));
	}

	
	@GetMapping(path = "/getbrandbyid/{id}")
	@Override
	public ResponseEntity<DtoBrand> getBrandById(@PathVariable(name = "id") Long id) {		
		return ResponseEntity.ok(brandService.getBrandById(id));
	}

}
