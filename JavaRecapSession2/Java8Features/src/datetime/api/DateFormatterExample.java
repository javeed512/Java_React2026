package datetime.api;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class DateFormatterExample {

	public static void main(String[] args) {
		
			LocalDateTime  date = LocalDateTime.now();

				System.out.println(date);

DateTimeFormatter  formatter = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);



				
			String dateWithFormat =	date.format(formatter);
			
				System.out.println(dateWithFormat);
				
				DateTimeFormatter  formatter2 = DateTimeFormatter.ofPattern("dd-MM-yyyy");		
				
			String  str =	LocalDate.now().format(formatter2);

				System.out.println(str);
	}

}
