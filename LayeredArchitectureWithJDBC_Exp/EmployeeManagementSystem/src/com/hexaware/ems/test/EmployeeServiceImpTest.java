package com.hexaware.ems.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.hexaware.ems.pojo.Employee;
import com.hexaware.ems.service.EmployeeServiceImp;
import com.hexaware.ems.service.IEmployeeService;

import java.util.logging.*;

class EmployeeServiceImpTest {
	
			Logger log = Logger.getLogger("EmployeeServiceImpTest");
	
	
	IEmployeeService service = new EmployeeServiceImp();

	@Test

	void testAddEmployee() {
		
		Employee emp = new Employee(108, "Jerry", 60000);
		
		int count =	service.addEmployee(emp);		
		
			log.info("record inserted");
		
			assertTrue(count > 0);
		
	}

	@Test
	void testSelectByEid() {
		
		
	Employee emp =		service.selectByEid(101);
		
				log.info("select by eid is tested");
	
	
		 		log.info(emp.toString());
	
				assertEquals(45000.0, emp.getSalary());
		
		
	}

}
