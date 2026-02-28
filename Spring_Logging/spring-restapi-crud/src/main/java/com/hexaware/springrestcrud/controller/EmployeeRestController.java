package com.hexaware.springrestcrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestcrud.entity.Employee;
import com.hexaware.springrestcrud.service.IEmployeeService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/employees")
public class EmployeeRestController {
	
	@Autowired
	IEmployeeService service;
	
				@PostMapping("/insert")
				public  Employee    addEmp(@RequestBody Employee emp) {
					
					log.info("rest api to insert employee object executed at rest controller");
					
					  return service.addEmployee(emp);
					
				}
	
				
				@PutMapping("/update")
				public  Employee    updateEmp(@RequestBody Employee emp) {
					
					  return service.updateEmployee(emp);
					
				}
	
				@GetMapping("/getbyid/{eid}")
				public   Employee  getById(@PathVariable  int eid) {
					
					
					return  service.getByEid(eid);
					
				}
				
				@GetMapping("/getall")
				public  List<Employee>  getAll(){
					
					
						log.debug("all employees data fetched from service to restcontroller");
					
					
					return service.getAllEmployees();
					
				}
				
				@GetMapping("/getallsorted")
				public  List<Employee>  getAllSorted(){
					
					
					return service.getAllEmployeesSorted();
					
				}
				
				
				@DeleteMapping("/deletebyid/{eid}")
				public String   deleteById(@PathVariable int eid) {
					
					
					return service.deleteByEid(eid);
					
				}
				
				
				@GetMapping("/getbyename/{ename}")
				public List<Employee>   getByEname(@PathVariable String ename){
					
					return  service.getByEname(ename);
					
				}
				
				
				@GetMapping("/getbysalarygt/{salary}")
				public List<Employee>   getBySalaryGT(@PathVariable double salary){
					
					return  service.getBySalaryGT(salary);
				}

				
				@GetMapping("/getbysalary/orderbyename/{salary}")
				public List<Employee>   getBySalaryOrderByEname(@PathVariable double salary){
					
					return  service.findBySalaryOrderByEname(salary);
				}

				@PutMapping("/updatesalary/{eid}/{salary}")
				public String   updateSalary(@PathVariable int eid , @PathVariable double salary) {
					
						int count =	service.updateSalary(salary, eid);
					
					return count +" Record updated...";
				}
				
				@GetMapping("/getallbysql")
				public List<Employee>  getAllBySQL(){
					
					
					return service.getAllBySQL();
					
				}
				
}
