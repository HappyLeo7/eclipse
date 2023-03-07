package sec08_Date_Time;

import java.util.Calendar;

public class CalendarSetDemo {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, 9, 24);

		System.out.println(c);
		System.out.println(toString(c));

		c.set(Calendar.YEAR, 2021);
		c.set(Calendar.MONDAY, 9);
		c.set(Calendar.DATE, 24);
		System.out.println(toString(c));

		c.set(Calendar.HOUR_OF_DAY, 10);
		c.set(Calendar.MINUTE, 20);
		c.set(Calendar.SECOND, 30);
		System.out.println(toString(c));

		c.add(Calendar.DATE, -90); // 다른 필드에 영향을 준다. 일이 넘어가면 월이 바뀐다.
		System.out.println(toString(c));

		c.roll(Calendar.DATE, 10); // 다른 필드에 영향을 못준다. 예시로 일을 바꿀때 30이나 31이 넘어가면 월이 바뀌지않는다
		System.out.println(toString(c));
	}

	public static String toString(Calendar c) {
		String date = c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONDAY) + 1) + "월 " + c.get(Calendar.DATE) + "일";
		String time = c.get(Calendar.HOUR_OF_DAY) + "시 " + (c.get(Calendar.MINUTE)) + "분 " + c.get(Calendar.SECOND)
				+ "초";

		return date + " " + time;
	}
}
