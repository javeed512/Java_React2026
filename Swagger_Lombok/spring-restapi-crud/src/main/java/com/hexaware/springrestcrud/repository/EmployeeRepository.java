package com.hexaware.springrestcrud.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.hexaware.springrestcrud.entity.Employee;

@Repository   //optional
public interface EmployeeRepository  extends  JpaRepository<Employee,Integer> {

	// select * from Emp_table  where  ename = ?;
			List<Employee> 	findByEname(String ename);
			
			//select * from Emp_table  where salary > ?;
		List<Employee>	  findBySalaryGreaterThan(double salary);
		
		
		// JPQL or HQL
		
		@Query("select  e  from Employee  e  where  e.salary > ?1 order by e.ename")
		 List<Employee>   findBySalaryOrderByEname(double salary);
		
		@Modifying
		@Query("update Employee e  set   e.salary = :sal  where  e.eid = :id")
		public int   updateSalary(@Param("sal")  double salary ,@Param("id") int eid);
		
		// Native query or SQL query
		@Query(value = "SELECT * FROM EMP_TABLE",nativeQuery = true	)
		public List<Employee>  getAllBySQL();
		
		
	
}
