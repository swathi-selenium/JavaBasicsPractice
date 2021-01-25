package Basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		//current date ....current time
		/*LocalDate	Represents a date 
		 * (year, month, day (yyyy-MM-dd))
		LocalTime	Represents a time 
		(hour, minute, second and milliseconds (HH-mm-ss-zzz))
		LocalDateTime	Represents both a date and a time 
		(yyyy-MM-dd-HH-mm-ss.zzz)
		DateTimeFormatter	
		Formatter for displaying and parsing date-time objects*/Date d=new Date();
 System.out.println(d.toString());
 SimpleDateFormat sdf =new SimpleDateFormat("MM/dd/yyyy");
 System.out.println(sdf.format(d));
	}

}
