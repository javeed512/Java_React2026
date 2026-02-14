package lambda.expressions;

import java.time.LocalDate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpTypes {

	public static void main(String[] args) {


			
		//Consumer<String>   consumer =  (String name) -> {  System.out.println(name); };
		
		
		Consumer<String>   consumer =   System.out::println;
		
			consumer.accept("Javeed");
			
			
		Supplier<LocalDate>  supplier = ()->{ return  LocalDate.now();};	
		
			LocalDate  date  = supplier.get();
			
			System.out.println(date);
		
		
		Predicate<Integer>  predicate = (Integer num)->{  return num > 0;};
		
				boolean   isValid =	predicate.test(100);
				
				System.out.println(isValid);
		

		Function<String, Integer>  function =  (String name)->{ return  name.length();}	;
		
		
			Integer  len =	function.apply("Javeed");
			
				System.out.println(len);
		
		
				
	}

}
