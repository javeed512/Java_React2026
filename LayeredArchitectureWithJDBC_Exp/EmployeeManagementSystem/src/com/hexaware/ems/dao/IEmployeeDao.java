package com.hexaware.ems.dao;

import java.util.List;

import com.hexaware.ems.pojo.Employee;

public interface IEmployeeDao {
	
	public int  addEmployee(Employee emp);
	
	public   List<Employee>    displayAllEmployees();
	
	public  int  updateEmployee(Employee emp);
	
	public    Employee   selectByEid(int eid);
	
	public     int  deleteByEid(int eid);
	
	

}
