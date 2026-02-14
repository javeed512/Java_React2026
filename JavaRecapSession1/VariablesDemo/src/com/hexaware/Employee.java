package com.hexaware;

import java.lang.*;

public class Employee extends Object{
	
	
	private static int eid;
	private static String ename;
	private  static double salary;
	
	
	public  Employee() {
		
		super();  // Object();
		
		System.out.println("Employee Object is created..");
		
	}


	public Employee(int eid, String ename, double salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
	}


	public int getEid() {
		return eid;
	}


	public void setEid(int eid) {
		this.eid = eid;
	}


	public static String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	
	

}
