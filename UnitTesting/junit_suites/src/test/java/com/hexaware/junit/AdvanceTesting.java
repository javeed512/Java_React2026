package com.hexaware.junit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class AdvanceTesting {

	

	@ParameterizedTest
	@ValueSource(strings = {"king","tom","javeed","ravi kumar"})
	void test(String name) {
		
		
		
		System.out.println("named tested "+name);
		assertTrue(name.length() > 3);


	}
	
	
	@RepeatedTest(3)
	void test2() {
		
		
			assertTrue(true);
		
	}

}
