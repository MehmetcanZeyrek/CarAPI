package com.mehmetcan.dto;

import java.util.List;

import com.mehmetcan.entities.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@NoArgsConstructor
@Data
public class DtoBrand {

	
	private String brandName;
	
	
	private List<Model> models;
}
