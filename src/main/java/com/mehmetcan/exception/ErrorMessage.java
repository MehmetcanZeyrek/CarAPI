package com.mehmetcan.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

	private TypeMessage typeMessage;
	
	private String staticString;
	
	public String prepareMessage() {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append(typeMessage.getMessage());
		
		if(stringBuilder!=null) {
			stringBuilder.append(": " + staticString);
		}
		return stringBuilder.toString();
	}
}
