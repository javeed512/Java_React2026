package com.hexaware.mvc.service;

import java.util.List;

import com.hexaware.mvc.pojo.Employee;

public interface IEmployeeService {
	
	
		public  int  addEmp(Employee emp);
		
		public   List<Employee>    displayAll();

}
