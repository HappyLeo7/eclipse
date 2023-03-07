package exx03;

import java.util.Calendar;

public class CalendarTest {
	public static void main(String[] args) {
		String[] weekName = { "일", "월", "화", "수", "목", "금", "토" };
		String[] noonName = { "오전", "오후" };

		Calendar c = Calendar.getInstance();
//set과get을 쓰면된다.
		c.set(2017, 6 - 1, 15, 15, 33, 40);

		int year = c.get(Calendar.YEAR);
		int month = c.get(Calendar.MONTH) + (1);
		int day = c.get(Calendar.DATE);
		int hour = c.get(Calendar.HOUR);
		int minute = c.get(Calendar.MINUTE);
		int second = c.get(Calendar.SECOND);
		String noon = noonName[c.get(Calendar.AM_PM)];
//		String noon = null;
//		if (hour >= 12) {
//
//			noon = noonName[1];
//
//		} else {
//			noon = noonName[0];
//		}
		String week = weekName[c.get(Calendar.DAY_OF_WEEK) - 1];// 요일 불러오기

		// 코드 추가

//		LocalDateTime b = LocalDateTime.of(2017, 06, 15, 13, 33, 40);
//		int year = b.getYear();
//		int month = b.getMonthValue();
//		int day = b.getDayOfMonth();
//		int hour = b.getHour();
//		int minute = b.getMinute();
//		int second = b.getSecond();
//		String noon = null;
//		String week;
//		if (hour >= 12) {
//
//			noon = noonName[1];
//
//		} else {
//			noon = noonName[0];
//		}

		System.out.println(year + "년 " + month + "월 " + day + "일 ");
		System.out.println(week + "요일 " + noon);
		System.out.println(hour + "시 " + minute + "분 " + second + "초 ");
	}
}
