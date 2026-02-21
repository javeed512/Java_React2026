package com.hexaware.hibernate.crud;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.hexaware.hibernate.crud.entity.Employee;

public class SelectRecords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		SessionFactory  sf =	HibernateUtil.getSessionFactory();
		
			Session session =		sf.openSession();

			
			Employee  emp =		session.get(Employee.class, 111);
			
			System.out.println(emp);
			
			
	}

}
