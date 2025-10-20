package com.mehmetcan;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mehmetcan.dto.DtoBrand;
import com.mehmetcan.service.abstracts.BrandService;

@SpringBootTest(classes = {VforvicApplication.class})
class VforvicApplicationTests {

	@Autowired
	private BrandService brandService;
	
	@Test
	public void testEmployeeById() {
		DtoBrand dtoBrand =  brandService.getBrandById(1L);
	assertNotNull(dtoBrand);
		
	}
}
