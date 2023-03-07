package sec08_Date_Time;

import java.time.LocalDate;
import java.time.Period;

public class LocalDatePeriodDemo {
	public static void main(String[] args) {
		// 오늘 출력
		LocalDate today = LocalDate.now();
		System.out.println("오늘 날짜 : " + today);
		// 올해 크리스마스 출력
		LocalDate klsms = LocalDate.of(today.getYear(), 12, 25);
		System.out.println("크리스마스 : " + klsms);
		// 크리스마스까지의 날짜 계산
		Period left = Period.between(today, klsms);
		System.out.println("크리스마스까지 앞으로 : " + left);
		System.out.println("크리스마스까지 앞으로 : " + left.getMonths() + "월 " + left.getDays() + "일 ");

		// 올해의 수능 날짜 11월 17일
		LocalDate ex = LocalDate.of(today.getYear(), 11, 17);
		System.out.println("올해 수능 : " + ex);

		// 수능까지 남은 날짜
		Period ll = Period.between(today, ex);
		System.out.println("수능까지 앞으로 : " + ll);
		System.out.println("수능까지 앞으로 : " + ll.getMonths() + "월 " + ll.getDays() + "일 ");

	}
}
