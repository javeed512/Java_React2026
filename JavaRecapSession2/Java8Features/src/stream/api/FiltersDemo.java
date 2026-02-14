package stream.api;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class FiltersDemo {

	public static void main(String[] args) {


				int  arr[] = {2,4,3,5,6,7,2,6,9,11}; 
				
		IntStream	 stream1 =	Arrays.stream(arr);
		
		System.out.println("Filter elements > 5");
				stream1.filter((n1)->{ return n1 > 5;}).forEach(System.out::println);
				
				IntStream	 stream2 =	Arrays.stream(arr);
				
				System.out.println("Show distinct elements");
					stream2.distinct().forEach(System.out::println);
				
					IntStream	 stream3 =	Arrays.stream(arr);
					System.out.println("Limit elements to 3");
					
					stream3.limit(3).forEach(System.out::println);
					
					
					
					IntStream	 stream4 =	Arrays.stream(arr);
					System.out.println("Skip 4 elements");
					
					stream4.skip(4).forEach(System.out::println);
					
					IntStream	 stream5 =	Arrays.stream(arr);
					
						OptionalInt  op =	stream5.reduce((a,b)->{ return a+b;});
					
						if(op.isPresent()) {
							
							System.out.println("Sum of Elements "+ op.getAsInt());
						}
						
						else {
							
							System.err.println("Sorry No Elements found");
						}
					
	}

}
