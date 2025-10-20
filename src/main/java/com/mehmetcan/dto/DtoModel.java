package com.mehmetcan.dto;

import java.util.List;

import com.mehmetcan.entities.Car;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class DtoModel {

	
	
	private String modelName;
	
	
	private List<Car> cars;
}
