package ch11.exam08;

import java.util.Calendar;

public class Example2 {

	public static void main(String[] args) {

		Calendar now = Calendar.getInstance();	//calendar는 protected이기 때문에 new로 선언 불가
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; //0부터 11까지이기때문에
		int date = now.get(Calendar.DAY_OF_MONTH);
		int day = now.get(Calendar.DAY_OF_WEEK);
		int amPm = now.get(Calendar.AM_PM);
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		System.out.println(day);
		System.out.println(amPm);
		System.out.println(hour);
		System.out.println(minute);
		System.out.println(second);

	}

}
