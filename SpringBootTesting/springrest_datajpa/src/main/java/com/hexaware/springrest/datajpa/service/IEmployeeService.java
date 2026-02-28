package com.hexaware.springrest.datajpa.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.hexaware.springrest.datajpa.entity.Employee;

public interface IEmployeeService {
	
	
		
			public  Employee  addEmployee(Employee emp);
			public  Employee  updateEmployee(Employee emp);
			
			public  List<Employee>			getAllEmployees();
	
			
			public  Employee getByEid(int eid);
			public  String  deleteByEid(int eid);
			
			
			public Employee  findByEname(String ename);
			
			public List<Employee>  findBySalaryGreaterThan(double salary);
			
			
			public List<Employee>	getByRange(double  low , double high);

			
			public  void   updateSalary(int eid ,  double salary);
			
			
			public List<Employee>  selectAll();
			
			
			
			public double  sumOfSalary();
			
			
}
