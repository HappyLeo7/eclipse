package sec08_Date_Time;

import java.time.LocalTime;

public class LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime totime = LocalTime.now();
		System.out.println(totime.getHour() + "시 " + totime.getMinute() + "분 " + totime.getSecond() + "초");

		LocalTime mt = totime.plusHours(2);
		mt = mt.plusMinutes(10);

		System.out.println("미팅 시간 : " + mt);
		System.out.println("미팅 시간 : " + mt.getHour() + "시 " + mt.getMinute() + "분 " + mt.getSecond() + "초");

	}
}
