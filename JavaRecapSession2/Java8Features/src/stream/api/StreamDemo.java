package stream.api;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamDemo {

	public static void main(String[] args) {


		
				Integer   nums[] = {10,13,9,7,21,18};
				
			Stream<Integer> stream1 =	Arrays.stream(nums);
			
				//stream1.forEach( (n1)->{ System.out.println(n1);});
				
				stream1.forEach( System.out::println);
				
				System.out.println("Elements greater than 10");
				
				Stream<Integer> stream2 =	Arrays.stream(nums);
				
	stream2.filter((n1)->{ return n1 > 10;}).forEach( (x) -> {System.out.println(x);});
		
	}

}
