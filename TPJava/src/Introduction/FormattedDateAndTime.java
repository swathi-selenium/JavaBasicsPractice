package Introduction;
import java.text.SimpleDateFormat;
import java.util.Date;
public class FormattedDateAndTime {

	public static void main(String[] args) {
		//Instantiate a date object
		Date now=new Date();
		System.out.println(now);
		
		SimpleDateFormat dnow =new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");
		System.out.println(dnow.format(now));
		String str =String.format("Current Date/Time:%tc",now);
		System.out.printf(str);
		
		//display time and date using $ sign
		System.out.printf("%1$s %2$tB %2$td,%2$tY", "Due date:",now);
		
		//display formatted date using <
		System.out.printf("%s %tB %<te,%<tY","Due date:",now);
	}

}
