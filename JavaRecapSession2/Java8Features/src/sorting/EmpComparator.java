package sorting;

import java.util.Comparator;

import stream.api.Employee;

public class EmpComparator  implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {

			String s1 = e1.toString();
			String s2 = e2.toString();
		
		return   s1.compareTo(s2);
	}

}
