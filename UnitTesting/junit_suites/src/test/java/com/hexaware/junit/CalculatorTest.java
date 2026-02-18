package com.hexaware.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

@DisplayName("TESTING_CALCULATOR")
class CalculatorTest {
	
	static Calculator cal;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
		cal = new Calculator();
		
		System.out.println("Before All executed");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		
		System.out.println("After All executed");
	}

	@BeforeEach
	void setUp() throws Exception {
		
		System.out.println("BeforeEach");
	}

	@AfterEach
	void tearDown() throws Exception {
		
		System.out.println("AfterEach");
	}

	@Test
	@DisplayName("ADDITION")
	@Tag("t1")
	void testAdd() {
		
		int  actual = cal.add(15,5);
		
		
		assertEquals(20, actual);
		
		System.out.println("add tested");
		
	}

	@Test
	@Disabled
	void testSub() {
		
		
		int actual =	cal.sub(10, 5);
		
		assertNotEquals(-5, actual);  // true
		
		System.out.println("sub tested");
		
		
	}

	@Test
	void testMul() {
		
		int actual =	cal.mul(10, 5);
		
		assertTrue(actual > 0);
		
		System.out.println("mul tested");
		
	}

	@Test
	void testDiv() {
		
	//	int actual =	cal.div(10, 0);
		
		//	assertEquals(2, actual);
		
	Exception exp =	assertThrows(ArithmeticException.class, ()->{ cal.div(10, 0); } );
	
	assertNotNull(exp);
			
			System.out.println("div tested");
		
		
		
	}

}
