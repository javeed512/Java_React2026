package datetime.api;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {


			LocalDateTime  dateTime = LocalDateTime.now();
			
			 System.out.println("day of month "+dateTime.getDayOfMonth());
			 
			 System.out.println("hour "+dateTime.getHour());
		
			 
			 ZoneId  zoneId = ZoneId.of("Africa/Harare");
			 
			ZonedDateTime  zdt = ZonedDateTime.now(zoneId);
			
			System.out.println(zdt);

	}

}
