package sec08_Date_Time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;

public class LocalDateTimeDemo2 {

	// Duration 변수 =Duration.between 시간 비교

	// Period 변수 = Period.between 날짜 비교
	public static void main(String[] args) {
		// 현재 시각 2022.4.25 10:20
		LocalDateTime today = LocalDateTime.of(2022, 4, 25, 10, 20);
		System.out.println("현재시간 :" + today);

		// 항공 1편의 출발 시간 2022.6.23 11:30
		LocalDateTime flight1 = LocalDateTime.of(2022, 6, 23, 11, 30);

		// 항공 2편의 출발 시간 2022.6.22 17:30
		LocalDateTime flight2 = LocalDateTime.of(2022, 6, 22, 17, 30);

		// 빠른 항공편을 선택하는 과정
		LocalDateTime myFlight;
		if (flight1.isBefore(flight2)) { // isBefore 는 시간 비교 하는 키워드
			myFlight = flight1;
		} else {
			myFlight = flight2;
		}
		System.out.println(myFlight);
		// 빠른 항공편의 비행 탑승시간까지 남은 날짜 계산
		Period day = Period.between(today.toLocalDate(), myFlight.toLocalDate());
		// 빠른 항공편의 비행 탑승시간까지 남은 시간 계산
		Duration time = Duration.between(today.toLocalTime(), myFlight.toLocalTime());
		System.out.println(day.getMonths() + "월 " + day.getDays() + "일");
		System.out.println(time);
		System.out.println(time.toSeconds() + " " + time.toMinutes() + " " + time.toHours());
		// 빠른
	}
}
