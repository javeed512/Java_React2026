package com.hexaware.springrestcrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hexaware.springrestcrud.entity.Employee;
import com.hexaware.springrestcrud.repository.EmployeeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
@Transactional
public class EmployeeServiceImp implements IEmployeeService {
	
	
	@Autowired
	EmployeeRepository repo;
	

	@Override
	public Employee addEmployee(Employee emp) {
		
		log.info("addEmp() executed in Service Layer");
	
		return   repo.save(emp);  // insert
	}

	@Override
	public Employee updateEmployee(Employee emp) {
		
		return  repo.save(emp);  // update
	}

	@Override
	public Employee getByEid(int eid) {
		
		return    repo.findById(eid).orElse(null);
	}

	@Override
	public String deleteByEid(int eid) {
		
			repo.deleteById(eid);
		
	
		return "Record  Deleted  successfully...";
	}

	@Override
	public List<Employee> getAllEmployees() {
		
		log.debug("All Employees fetch from Repo to Service layer");
		
		return   repo.findAll();
	}

	@Override
	public List<Employee> getByEname(String ename) {


		return   repo.findByEname(ename);
	}

	@Override
	public List<Employee> getBySalaryGT(double salary) {
	
		return repo.findBySalaryGreaterThan(salary);
	}

	@Override
	public List<Employee> findBySalaryOrderByEname(double salary) {
		
		return repo.findBySalaryOrderByEname(salary);
	}

	@Override
	public int updateSalary(double salary, int eid) {
		
		return repo.updateSalary(salary, eid);
	}

	@Override
	public List<Employee> getAllEmployeesSorted() {
		
		//return  repo.findAll(Sort.by("ename")); // select * from Emp_Table order by ename;
		
		return repo.findAll(Sort.by(Direction.DESC, "salary"));
	}

	@Override
	public List<Employee> getAllBySQL() {
		
		return repo.getAllBySQL();
	}

}
