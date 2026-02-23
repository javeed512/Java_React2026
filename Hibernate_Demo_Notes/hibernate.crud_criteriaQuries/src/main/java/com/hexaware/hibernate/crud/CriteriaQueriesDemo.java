package com.hexaware.hibernate.crud;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

import com.hexaware.hibernate.crud.entity.Employee;

public class CriteriaQueriesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Session session = HibernateUtil.getSessionFactory().openSession();

		Criteria cr = session.createCriteria(Employee.class);

		List<Employee> list = cr.list();

		list.stream().forEach(System.out::println);

		cr.add(Restrictions.between("salary", 30000.0, 70000.0));
		// select * from Emp_Table where salary between 30000.0 and 70000.0;

		List<Employee> list2 = cr.list();

		list2.stream().forEach(System.out::println);

		cr.add(Restrictions.gt("salary", 30000.0));
		cr.addOrder(Order.asc("ename"));

		System.out.println(cr.list());

		Criteria cr2 = session.createCriteria(Employee.class);

		List<Employee> emplist = cr2.list();

		Criterion csalary = Restrictions.gt("salary", 20000.0);
		Criterion cename = Restrictions.ilike("ename", "J%");

		// To get records matching with OR conditions
		LogicalExpression orExp = Restrictions.and(csalary, cename);
		cr2.add(orExp);

		List<Employee>  afterList =		cr2.list();
		
		afterList.stream().forEach(System.out::println);
		
	}

}
