package in.synxt.datesdemo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class App {
	public static void main(String[] args) throws ParseException {
		Calendar calendar = Calendar.getInstance();
		System.out.println(calendar.get(Calendar.YEAR));
		
		Calendar cldr = new GregorianCalendar(2022,6,10);
		System.out.println(cldr);
		cldr.set(Calendar.MONTH, 5);
		Date millis = cldr.getTime();
		System.out.println(millis);
		
		String dob = "10/OCT/1998";
		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy"); 
		Date dobObj = format.parse(dob);
		System.out.println(dobObj);
		
		Date today = new Date();
		String dobStr = format.format(today);
		System.out.println(dobStr);
	}
}
