package com.mehmetcan.exception;


import lombok.Getter;

@Getter
public enum TypeMessage {
	
	NO_VALUE("100","Id degeri bulunamadi"),
	GENERAL_EXCEPTION("101","Genel bir hata meydana geldi");
	
  private String code;
	
	private String message;

	private TypeMessage(String code, String message) {
		this.code = code;
		this.message = message;
	}

	
	

	

}
