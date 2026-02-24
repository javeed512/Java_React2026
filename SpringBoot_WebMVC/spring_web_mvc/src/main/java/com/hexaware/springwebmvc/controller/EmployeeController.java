package com.hexaware.springwebmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hexaware.springwebmvc.entity.Employee;

import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/api")
public class EmployeeController {
	
			
			
	
		
			@RequestMapping(value="/add" , method=RequestMethod.POST)
			public  String    addEmployee(@ModelAttribute   Employee emp , HttpSession session) {
				
				
						session.setAttribute("emp", emp);
						
						// service.addEmployee(emp);
						
				return  "success";   // we are returning  view that is , success is a page/view name
				
				
				
			}
			
			
			
			
			@RequestMapping("/getall")
			public  String    displayAll() {
				
				
			// List<Employee>  empList =		// service.getAll()  ----> // repo.getAll() 
				
				
				return  "display";
				
			}
			
			
			
			
			
			
			
			
			
			
		
	
	

}
