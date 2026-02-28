package com.hexaware.springrest.datajpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.service.IEmployeeService;

@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {

	@Autowired
	IEmployeeService service;

	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee emp) {

		return service.addEmployee(emp);

	}

	@GetMapping("/getall")
	public List<Employee> getAll() {

		return service.getAllEmployees();

	}

	@PutMapping("/update")
	public Employee updateEmployee(@RequestBody Employee emp) {

		return service.updateEmployee(emp);

	}

	@GetMapping("/get/{eid}")
	public Employee getByEid(@PathVariable int eid) {

		return service.getByEid(eid);

	}

	@DeleteMapping("/delete/{eid}")
	public String deleteByEid(@PathVariable int eid) {

		return service.deleteByEid(eid);

	}

	@GetMapping("/getbyename/{ename}")
	public Employee findByEname(@PathVariable String ename) {

		return service.findByEname(ename);

	}

	@GetMapping("/getbysalarygt/{salary}")
	public List<Employee> findBySalaryGreaterThan(@PathVariable double salary) {

		return service.findBySalaryGreaterThan(salary);

	}
	
	@GetMapping("/getbyrange/{low}/{high}")
	public List<Employee> getByRange(@PathVariable double low,@PathVariable  double high) {


		return service.getByRange(low, high);
	}

	
	@PutMapping("/update-salary/{eid}/{salary}")
	public  ResponseEntity<String>   updateSalary(@PathVariable int eid ,@PathVariable double salary) {
		
		
			service.updateSalary(eid, salary);
			
			return new  ResponseEntity<String>("Salary updated Successfully ", HttpStatus.OK );
		
	}
	
	
	@GetMapping("/selectall")
	public List<Employee>  selectAll(){ // native query selection
		
		
		return service.selectAll();
	}
	
	@GetMapping("/getsumofsalary")
	public double   getSumOfSalary() {
		
		
			return service.sumOfSalary();
	}
	
	
	

}
