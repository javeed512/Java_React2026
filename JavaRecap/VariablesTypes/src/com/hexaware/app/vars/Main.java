package com.hexaware.app.vars;

public class Main {

	public static void main(String[] args) {

		
			Employee e1 = new Employee();
			
			
			System.out.println(e1.getEid() + " "+ e1.getEname() + " "+e1.getSalary());
			
		
			Employee e2 = new Employee(101, "King", 9000.0);
			
			
			System.out.println(e2.getEid() + " "+ e2.getEname() + " "+e2.getSalary());
			
			
			e2.setEname("King Khan");
			
			System.out.println(e2.getEid() + " "+ e2.getEname() + " "+e2.getSalary());
		
			
			System.out.println("e2 "+e2); // e2.toString();
			
			System.out.println("e1 "+e1);
		
		
	}

}
