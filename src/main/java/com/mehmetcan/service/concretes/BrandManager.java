package com.mehmetcan.service.concretes;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PostMapping;

import com.mehmetcan.core.MapperService;
import com.mehmetcan.dto.DtoBrand;
import com.mehmetcan.entities.Brand;
import com.mehmetcan.exception.BaseException;
import com.mehmetcan.exception.ErrorMessage;
import com.mehmetcan.exception.TypeMessage;
import com.mehmetcan.repository.BrandRepository;
import com.mehmetcan.service.abstracts.BrandService;

@Service
public class BrandManager implements BrandService {

	@Autowired
	private BrandRepository brandRepository;
	
	@Autowired
	private MapperService mapperService;
	
	@PostMapping(path = "/savebrand")
	@Override
	public DtoBrand saveBrand(DtoBrand newBrand) {
		
		Brand brand = mapperService.forRequest().map(newBrand, Brand.class);
		
		brandRepository.save(brand);
		
		return newBrand;
	}

	@Transactional
	@Override
	public DtoBrand getBrandById(Long id) {
		Optional<Brand> optional = brandRepository.findById(id);
		if(optional.isEmpty()) {
			throw new BaseException(new ErrorMessage(TypeMessage.NO_VALUE, id.toString()));
	}
		Brand dbBrand = brandRepository.findById(id).orElseThrow();
		DtoBrand dtoBrand = mapperService.forResponse().map(dbBrand, DtoBrand.class);
		return dtoBrand;
	}

}
