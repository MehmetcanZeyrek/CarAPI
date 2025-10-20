package com.mehmetcan.service.abstracts;

import com.mehmetcan.dto.DtoBrand;

public interface BrandService {

	public DtoBrand saveBrand(DtoBrand newBrand);
	
	public DtoBrand getBrandById(Long id);
	
	
}
