package com.hexaware.springanno.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("emp")

@Scope("prototype")
public class Employee {
	
	private int eid;
	private String ename;
	private double salary;
	
	@Autowired
	private  Address addr;
	
	
	@Autowired
	private Thread thread;
	
	
	
	public Employee() {
		
		
	}
	
	
	
	
	//@Autowired
	public Employee(@Autowired Address addr) {
		super();
		this.addr = addr;
	}





	public Employee(int eid, String ename, double salary, Address addr) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.salary = salary;
		this.addr = addr;
	}
	
	
	
	
	
	public Thread getThread() {
		return thread;
	}




	public void setThread(Thread thread) {
		this.thread = thread;
	}




	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
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
	public Address getAddr() {
		return addr;
	}
	public void setAddr( Address addr) {
		this.addr = addr;
	};
	
	
	
	

}
