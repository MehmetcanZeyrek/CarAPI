package com.mehmetcan.controller.concretes;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mehmetcan.controller.abstracts.ICarController;


@RestController
@RequestMapping(path = "/rest/api")
public class CarController implements ICarController {

	
	
	
}
