package com.hexaware.springrest.datajpa.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.hexaware.springrest.datajpa.entity.Employee;

@SpringBootTest
class EmployeeServiceImpTest {

	@Autowired
	IEmployeeService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Disabled
	void testAddEmployee() {

		Employee emp = new Employee(121, "Dani", 75000);

		Employee e1 = service.addEmployee(emp);

		assertEquals(75000, e1.getSalary());

	}

	@Test
	void testUpdateEmployee() {

		Employee e1 = service.getByEid(121);

		e1.setSalary(99000);

		Employee emp = service.updateEmployee(e1);

		assertEquals(99000, emp.getSalary());

	}

	@Test
	void testGetByEid() {

		Employee emp = service.getByEid(121);

		assertNotNull(emp);

	}

	@Test
	void testSumOfSalary() {

		double sum = service.sumOfSalary();

		assertTrue(sum > 200000);

	}

}
