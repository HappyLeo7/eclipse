package sec08_Date_Time;

import java.time.LocalDate;

public class LocalDateDemo {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today);

		LocalDate xmas = LocalDate.of(today.getYear(), 12, 25); // 해당 지정 날짜
		System.out.println(xmas);

		LocalDate eve = xmas.minusDays(1); // 마이너스
		System.out.println(eve);
	}
}
