package Basics;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemo {

	public static void main(String[] args) {
		Calendar cal=Calendar.getInstance();
		SimpleDateFormat sdf =new SimpleDateFormat("MM/dd/yyyy");
		 System.out.println(sdf.format(cal.getTime()));
		 System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		 System.out.println(cal.get(Calendar.AM_PM));

	}

}
