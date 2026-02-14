package sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import stream.api.Employee;

public class ComparatorLambdaExp {

	public static void main(String[] args) {


		List<Employee>  list  = new ArrayList<Employee>();
		
		list.add(new Employee(101, "king", 50000, "Manager"));
		list.add(new Employee(102, "tom", 30000, "Developer"));
		list.add(new Employee(103, "ford", 40000, "Developer"));

		list.add(new Employee(104, "scott", 35000, "Tester"));
		list.add(new Employee(105, "ford", 20000, "Tester"));
		list.add(new Employee(106, "javeed", 70000, "Manager"));

		

		
		Comparator<Employee>  comparatorObj = Comparator.comparing((Employee emp)->{ return emp.getEname();}).thenComparing(Employee::getSalary);
		
		
		 					Collections.sort(list , comparatorObj);
		 					
		 					list.forEach(System.out::println);

	}

}
