package com.hexaware;

public class Test {

	public static void main(String[] args) {

		// Employee e1 = new Employee();

		// e1.eid = 101;

		// System.out.println(e1.eid +" "+ e1.ename +" "+e1.salary);

		Employee e1 = new Employee(101, "king", 45000);

			e1.setSalary(75000);
		
		System.out.println(e1.getEid() + " " + e1.getEname() + " " + e1.getSalary());

		Employee e2 = new Employee();

		e2.setEname("tom");

		System.out.println(e2.getEid() + " " + e2.getEname() + " " + e2.getSalary());

		
		System.out.println(Employee.getEname());
		
	}

}
