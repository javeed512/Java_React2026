package com.hexaware.exceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.hexaware.exceptionhandling.exceptions.EmployeeNotFoundException;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	
	
	
	
	
	
	@ExceptionHandler(ArithmeticException.class)
	public  ResponseEntity<String>   handleExp(){
		
		return  new ResponseEntity<String>("Sorry! You can't divide number by zero", HttpStatus.BAD_REQUEST);
		
	}
	
	
	@ExceptionHandler(NullPointerException.class)
	@ResponseStatus(reason = "Null value found for object" , code = HttpStatus.NOT_ACCEPTABLE)
	public  void   handleNPExp() {
		
		
	}
	
	
	

	@ExceptionHandler(EmployeeNotFoundException.class)
	public  ResponseEntity<String>   handleEmpNotFoundExp(){
		
		return  new ResponseEntity<String>("Sorry! Employee Not Found", HttpStatus.NOT_FOUND);
		
	}
	
	
	
	

}
