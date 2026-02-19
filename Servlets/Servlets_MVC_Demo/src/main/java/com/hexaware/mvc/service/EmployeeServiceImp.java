package com.hexaware.mvc.service;

import java.util.List;

import com.hexaware.mvc.dao.IEmployeeDao;
import com.hexaware.mvc.pojo.Employee;

public class EmployeeServiceImp implements IEmployeeService {
	
	
	private IEmployeeDao dao;
	
	
	

	public EmployeeServiceImp(IEmployeeDao dao) {
		super();
		this.dao = dao;
	}

	@Override
	public int addEmp(Employee emp) {
		
		return dao.addEmp(emp);
		
	}

	@Override
	public List<Employee> displayAll() {
		
		return dao.displayAll();
		
	}

}
