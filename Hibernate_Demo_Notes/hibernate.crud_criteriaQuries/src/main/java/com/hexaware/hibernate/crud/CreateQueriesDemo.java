package com.hexaware.hibernate.crud;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.hexaware.hibernate.crud.entity.Employee;

public class CreateQueriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		

		SessionFactory  sf =	HibernateUtil.getSessionFactory();
		
			Session session =		sf.openSession();

			
		Query<Employee> query =		session.createQuery("select e from Employee e where e.eid = ?1");// HQL
		
					query.setParameter(1, 111);

		Employee emp =	query.getSingleResult();
		
		System.out.println(emp);
		
		
		//select multiple records
		
		Query<Employee>  query2 =	session.createQuery("select e from Employee e");
		
			List<Employee>  list =		query2.getResultList();
			
			System.out.println("Select all employees");
			
			for (Employee employee : list) {
				
				
				System.out.println(employee);
				
			}
			
			System.out.println("Native query records");
			
		
			Query<Employee>  query3 =	session.createNativeQuery("select * from Emp_Table");
			
			List<Employee>  list2 =		query2.getResultList();
			
			System.out.println("Select all employees");
			
			for (Employee employee : list2) {
				
				
				System.out.println(employee);
				
			}
			
		
		
		
		
		
		
		
				
	}

}
