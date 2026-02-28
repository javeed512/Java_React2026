package com.hexaware.springrest.datajpa.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrest.datajpa.entity.Employee;

@SpringBootTest
class EmployeeRestControllerTest {

	@Autowired
	RestTemplate restTemplate;

	@Test
	@Disabled
	void testAddEmployee() {

		Employee requestBody = new Employee(114, "Babu", 80000);

		ResponseEntity<Employee> response = restTemplate.postForEntity("http://localhost:8080/api/employees/add",
				requestBody, Employee.class);

		Employee emp = response.getBody();

		assertNotNull(emp);

	}

	@Test
	@Disabled
	void testUpdateEmployee() {
		
		int eid = 114;
		
		Employee emp =	restTemplate.getForObject("http://localhost:8080/api/employees/get/"+eid, Employee.class);   
		
				emp.setEname("Banu Rao");
				emp.setSalary(95000);
		
		
				restTemplate.put("http://localhost:8080/api/employees/update", emp);
				
				Employee emp2 =	restTemplate.getForObject("http://localhost:8080/api/employees/get/"+eid, Employee.class);   		

				
					assertEquals(95000, emp2.getSalary());
	}

	@Test
	void testGetByEid() {
		
			int eid = 101;
		
		
			Employee emp =	restTemplate.getForObject("http://localhost:8080/api/employees/get/"+eid, Employee.class);
			
			assertEquals(99000, emp.getSalary());

	}

	@Test
	void testDeleteByEid() {
		
		int eid = 114;
		
		Employee emp =	restTemplate.getForObject("http://localhost:8080/api/employees/get/"+eid, Employee.class);  
		
			restTemplate.delete("http://localhost:8080/api/employees/delete/"+eid);
			
			Employee emp2 =	restTemplate.getForObject("http://localhost:8080/api/employees/get/"+eid, Employee.class);  
			
			
			
			assertNull(emp2);
			
		
		

	}

}
