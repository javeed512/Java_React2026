package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class EmpStreamDemo {

	public static void main(String[] args) {


		  List<Employee>   list = new ArrayList<Employee>();
		  
		  	list.add(new Employee(101,"king",50000,"Manager"));
		  	list.add(new Employee(102,"tom",30000,"Developer"));
		  	list.add(new Employee(103,"jerry",40000,"Developer"));
		  	
		  	list.add(new Employee(104,"scott",35000,"Tester"));
		  	list.add(new Employee(105,"ford",20000,"Tester"));
		  	list.add(new Employee(106,"javeed",70000,"Manager"));
		  	
		  	
		  		Stream<Employee>  stream1 =	list.stream();
		  		
		  		
		//  	stream1.map((emp)->{ return emp.getEname();}).forEach(System.out::println);
		  		
		  		//stream1.forEach( (emp)->{ System.out.println(emp);});
		  		
		  		stream1.filter( (emp)->{  return emp.getSalary() > 30000 ;}).forEach(System.out::println);
		  		
		  		
		

	}

}
