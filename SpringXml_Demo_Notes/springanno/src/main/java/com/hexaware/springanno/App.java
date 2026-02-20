package com.hexaware.springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.hexaware.springanno.beans.Employee;

/**
 * Hello world!
 *
 */

@Configuration
@ComponentScan(basePackages = "com.hexaware.springanno.*")
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        	
        ApplicationContext context =		new  AnnotationConfigApplicationContext(App.class);
        
        	Employee e =	  context.getBean(Employee.class);
        	
        	System.out.println(e);
        
        	
Employee emp =	  context.getBean("emp",Employee.class);
        	
        	System.out.println(emp);
        	
        				emp.setEid(101);
        				emp.setEname("king");
        				emp.setSalary(5000);
        
        
    }
}
