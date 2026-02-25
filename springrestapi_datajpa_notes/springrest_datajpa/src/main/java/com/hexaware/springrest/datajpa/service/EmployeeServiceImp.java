package com.hexaware.springrest.datajpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.hexaware.springrest.datajpa.entity.Employee;
import com.hexaware.springrest.datajpa.repository.EmployeeRepository;

@Service
public class EmployeeServiceImp implements IEmployeeService {
	
	@Autowired
	EmployeeRepository repo;

	@Override
	public Employee addEmployee(Employee emp) {
	
			return repo.save(emp);  // insert
		
	}

	@Override
	public List<Employee> getAllEmployees() {

		
			return	repo.findAll(Sort.by("ename"));
	}

	@Override
	public Employee updateEmployee(Employee emp) {


		return repo.save(emp);  // update
	}

	@Override
	public Employee getByEid(int eid) {
		
		return repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteByEid(int eid) {


		
		// repo.deleteById(eid);
		
		String msg = "Record Not Found";
		
		Employee e1 =	repo.findById(eid).orElse(null);
		
		
				if(e1 != null) {
					
					repo.delete(e1);
					
					msg = "Record deleted successfully ";
					
				}
		
		 
		 return msg;
		 
	}

}
