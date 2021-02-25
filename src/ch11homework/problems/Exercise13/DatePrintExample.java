package ch11homework.problems.Exercise13;

import java.util.Calendar;
import java.util.Date;

public class DatePrintExample {

	public static void main(String[] args) {
		
		Date now = new Date();
		
		Calendar cl = Calendar.getInstance();
		
		System.out.println(cl.get(Calendar.YEAR));
		System.out.println(cl.get(Calendar.MONTH) + 1);
		System.out.println(cl.get(Calendar.DAY_OF_MONTH));
		System.out.println(cl.get(Calendar.DAY_OF_WEEK) - 1);
		System.out.println(cl.get(Calendar.HOUR_OF_DAY));
		System.out.println(cl.get(Calendar.MINUTE));
		


	}

}
