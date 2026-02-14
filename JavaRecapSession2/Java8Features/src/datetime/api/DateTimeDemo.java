package datetime.api;

import java.time.LocalDate;
import java.time.LocalTime;

public class DateTimeDemo {

	public static void main(String[] args) {


	  LocalDate  date =	LocalDate.now();
	  
	  System.out.println(date);
	  
	  	LocalDate independence =LocalDate.of(1947, 8, 15);	  
	  
	  	System.out.println(independence);
	  	
	  	
	  		System.out.println("Day of year "+date.getDayOfYear());
	  		System.out.println("Day of week "+date.getDayOfWeek());
	  		System.out.println("Year "+date.getYear());
	  		
	  		System.out.println("Plus Month "+date.plusMonths(1));
	  		System.out.println("Minus Year "+date.minusWeeks(3));
	  		
	  		System.out.println(date.minusYears(1).isLeapYear());
	  		
	  		System.out.println(date.isAfter(independence));
	  		
	  		System.out.println(independence.isBefore(date));
	  		
	  		System.out.println(date.withMonth(3));
	  		
	  
	  		LocalTime time = LocalTime.now();
	  		
	  		System.out.println("Hour "+time.getHour());
	  		
	  		System.out.println("Plus Hours "+time.plusHours(3));
	  		
	  		
	  		

	}

}
