package com.hexaware.springrest.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.entity.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	
			@PostMapping("/add")
			public  String   addEmployee(@RequestBody Employee emp) {
				
				
				
				return "Employee added to the DB "+emp;
				
			}
			
			@GetMapping("/getall")
			public   String   getAll() {
				
				return "Get request success , Get All Records from DB";
				
			}
			
			
			@GetMapping("/get/{eid}")
			public String  getById(@PathVariable int eid) {
				
				
				return "Employee Record for eid "+eid;
			}
			
			
			
			@PutMapping("/update")
			public String   updateEmployee(@RequestBody Employee emp) {
				
				return "Employee record updated "+emp;
				
			}
			
			@DeleteMapping("/delete/{eid}")
			public String deleteById(@PathVariable int eid) {
				
				return  "Record Deleted for Eid "+eid;
				
				
			}
			
			
			
			
			
			
	
	
	
	
}
