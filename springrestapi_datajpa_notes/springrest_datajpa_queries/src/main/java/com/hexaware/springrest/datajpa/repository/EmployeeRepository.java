package com.hexaware.springrest.datajpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.hexaware.springrest.datajpa.entity.Employee;

@Repository // optional
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	public Employee findByEname(String ename); // select * from EmpTable where ename = ?;

	public List<Employee> findBySalaryGreaterThan(double salary); // select * from EmpTable where salary > ?;
	
	
			@Query("select  e from  Employee e  where salary between  ?1  AND ?2")
			public List<Employee>	getByRange(double  low , double high);
	
	
	
}
