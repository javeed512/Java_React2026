package sorting;

import java.util.Set;
import java.util.TreeSet;

import stream.api.Employee;

public class EmpTreeSet {

	public static void main(String[] args) {

		/*
		 * Set<String> set = new TreeSet<String>();
		 * 
		 * set.add("B"); set.add("A"); // B.compareTo(A); 66 - 65 = 1 set.add("C"); //
		 * B.compareTo(C); 66 - 67 = -1 set.add("E"); // C.compareTo(E); 67- 69 = -2
		 * set.add("D"); // E.compareTo(D); 69 - 68 = 1
		 * 
		 * 
		 * System.out.println(set);
		 */

		Set<Employee> set = new TreeSet<Employee>(new EmpComparator());

		set.add(new Employee(101, "king", 50000, "Manager"));
		set.add(new Employee(102, "tom", 30000, "Developer"));
		set.add(new Employee(103, "jerry", 40000, "Developer"));

		set.add(new Employee(104, "scott", 35000, "Tester"));
		set.add(new Employee(105, "ford", 20000, "Tester"));
		set.add(new Employee(106, "javeed", 70000, "Manager"));

		System.out.println(set);

		
		
		
	}

}
