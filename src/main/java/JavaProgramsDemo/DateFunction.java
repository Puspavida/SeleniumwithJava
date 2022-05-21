package JavaProgramsDemo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Display local current time
		//LocalDate myobj = LocalDate.now();
		//System.out.println(myobj);
		//local date and time Display
		LocalDateTime myobj1 = LocalDateTime.now();
		System.out.println("The Local Date and Time is: " +myobj1);
		//Date formatting
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String formattedDate = myFormatObj.format(myobj1);
		
		System.out.println(formattedDate);
		
		
	}

}
