package com.hexaware.springxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hexaware.springxml.bean.Address;
import com.hexaware.springxml.bean.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
        	ApplicationContext context =		new  ClassPathXmlApplicationContext("application.xml");
        	
        			
        	Employee emp = 			context.getBean("emp" , Employee.class); //byName
        	
        	System.out.println(emp);
        	
        	Employee  emp2 = context.getBean("emp" , Employee.class);
        	
        	System.out.println(emp2);
        	
        //	Employee e2 =  context.getBean(Employee.class); //byType
        	
        	//System.out.println(e2);
        	
        	System.out.println(emp.getEid() + " "+ emp.getEname() +" "+emp.getSalary() );
        	
        	System.out.println(emp.getAddr());
        	
        	
        		Address  a1 =			context.getBean("a1",Address.class);
        		
        		System.out.println(a1);
        	
        	
        	
        
        
    }
}
