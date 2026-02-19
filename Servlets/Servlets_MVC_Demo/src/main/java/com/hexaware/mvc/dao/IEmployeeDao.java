package com.hexaware.mvc.dao;

import java.util.List;

import com.hexaware.mvc.pojo.Employee;

public interface IEmployeeDao {
	
	
	public  int  addEmp(Employee emp);
	
	public   List<Employee>    displayAll();

}
