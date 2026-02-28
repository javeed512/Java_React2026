package com.hexaware.lombok;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hexaware.lombok.entity.Employee;

@SpringBootApplication
public class SpringbootLombokApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootLombokApplication.class, args);
		
		
		  Employee  emp = new Employee();
		  
		  Employee emp2 = new Employee(0, null, 0);
		  
		 
		
	}

}
