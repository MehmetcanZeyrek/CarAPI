package com.mehmetcan.handler;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

import com.mehmetcan.exception.BaseException;

@ControllerAdvice
public class GlobalExceptionHandler {

	
	@ExceptionHandler(value = {BaseException.class})
	public ResponseEntity<ApiError> baseException(BaseException baseException,WebRequest webRequest) {
	return ResponseEntity.badRequest().body(CreateApiError(baseException.getMessage(),webRequest));
	}
	
	public <T> ApiError<T> CreateApiError(T data,WebRequest webRequest) {
		
		ApiError<T> apiError = new ApiError<>();
		apiError.setData(data);
		apiError.setStatus(HttpStatus.BAD_REQUEST.value());
		apiError.setPath(webRequest.getDescription(false));
		apiError.setHostName(getHostName());
		return apiError;
	}
	
	public String getHostName() {
		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			return "Bekenmeyen hata " + e.getMessage();
		}
	}
}
