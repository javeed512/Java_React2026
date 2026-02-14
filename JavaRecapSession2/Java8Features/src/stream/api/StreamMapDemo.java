package stream.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapDemo {

	public static void main(String[] args) {


			List<String> list = new ArrayList<String>();
			
					list.add("javeed");
					list.add("tom cruze");
					list.add("smith");
					list.add("akash kumar");
					list.add("jerry");
					
					
			Stream<String> stream1 = list.stream();
			
		
			
	List list2 =	stream1.map((name)->{  return name.length(); }).filter((len)->{return len > 5;}).collect(Collectors.toList());
		
			System.out.println(list2);
			

	}

}
