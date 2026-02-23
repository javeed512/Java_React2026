package com.hexaware.hibernate.crud;

import java.util.List;

import javax.persistence.NamedNativeQuery;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import com.hexaware.hibernate.crud.entity.Employee;

public class NamedQueryDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			List<Employee>  list =	getAll();
			
				list.forEach((emp)->{System.out.println(emp);});
				
				
				
				System.out.println("Native Named Query");
				
				
			List  empList =	getSorted();
			
			
			System.out.println(empList);

	}

	public static List<Employee> getAll() {

		Session session = HibernateUtil.getSessionFactory().openSession();

		Query<Employee> query = session.createNamedQuery("getAll");

		List<Employee> list = query.getResultList();

			return list;
		
	}
	
	
	
	
	
	public static List<Employee>  getSorted(){
		
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		NativeQuery   nq =     session.getNamedNativeQuery("getSorted");
		
			
			List list =		nq.getResultList();
			
			return list;
		
		
		
	}
	
	
	
	

}
