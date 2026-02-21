package com.hexaware.springanno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

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
        				
        				System.out.println(emp.getAddr());

        				System.out.println(emp.getThread());
        				
        		Thread t =		context.getBean("t1",Thread.class);
        		
        			System.out.println(t);
        				
        				
        
    }
    
    
    @Bean("t1")
    @Scope(scopeName = "prototype")
    public Thread   getThreadObj() {
    	
    	
    	
    	return  new Thread();
    	
    }
    
    
    
    
    
}
