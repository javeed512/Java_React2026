package stream.api;

import java.util.ArrayList;
import java.util.List;

public class SortingDemo {

	public static void main(String[] args) {


		List<String> list = new ArrayList<String>();
		
		list.add("javeed");
		list.add("tom cruze");
		list.add("smith");
		list.add("akash kumar");
		list.add("jerry");
		
		
			list.stream().sorted().forEach(System.out::println);
			
		
			
		
		
	}

}
