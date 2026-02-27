package com.hexaware.exceptionhandling.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.exceptionhandling.exceptions.EmployeeNotFoundException;

@RestController
@RequestMapping("/api/exp")
public class HelloRestController {
	
	
			@GetMapping("/div/{n1}/{n2}")
			public String   div(@PathVariable int n1 , @PathVariable int n2) {
				
						String  name = null;
						int length =  name.length();
				
				
						int result = n1/n2;
						
						return "The Result is "+result;
				
				
				
			}
			
			
			@GetMapping("/getemp")
			public   String   getEmp() throws EmployeeNotFoundException {
				
				 
					throw  new EmployeeNotFoundException();
				
			}
			
			
			
			/*
			 * @ExceptionHandler(ArithmeticException.class) public ResponseEntity<String>
			 * handleExp(){
			 * 
			 * return new ResponseEntity<String>("Sorry! You can't divide number by zero",
			 * HttpStatus.BAD_REQUEST);
			 * 
			 * }
			 * 
			 * 
			 * @ExceptionHandler(NullPointerException.class)
			 * 
			 * @ResponseStatus(reason = "Null value found for object" , code =
			 * HttpStatus.NOT_ACCEPTABLE) public void handleNPExp() {
			 * 
			 * 
			 * }
			 */
			
			
			
			
			
			
			
			
	
	

}
