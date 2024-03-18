package com.lcwd.hotel.service.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.lcwd.hotel.service.payloads.ApiResponse;

@RestControllerAdvice
public class GlobalEceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public  ResponseEntity<ApiResponse>hadlerResourceNotFoundException(ResourceNotFoundException ex){
	
String message=ex.getMessage();
ApiResponse response=ApiResponse.builder().message(message).sucess(true).status(HttpStatus.NOT_FOUND).build();
return new ResponseEntity<ApiResponse>(response,HttpStatus.NOT_FOUND);
}
}