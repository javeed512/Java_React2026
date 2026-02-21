package com.hexaware.hibernate.crud;



import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.hibernate.crud.entity.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        
       SessionFactory  sessionFactory = 		HibernateUtil.getSessionFactory();
       
       			Session session =			sessionFactory.openSession();
       			
       		Transaction		tx =	session.beginTransaction();
       		
       		
       			//DML Operation
       		
       		//	Employee emp = new Employee(111, "Javeed", 60000);
       		
       		//Serializable  ser =		session.save(emp);
       		
       		//	System.out.println("Record inserted for eid "+ ser);
       					
       		
       		Employee e1 =	session.get(Employee.class, 111);
       		
       		
       				System.out.println(e1);
       				
       				e1.setSalary(99000);
       				
       				
       				session.save(e1); // update
       				
       				//session.delete(e1);
       				
       				
       		tx.commit();
        
        
        
        
    }
}
