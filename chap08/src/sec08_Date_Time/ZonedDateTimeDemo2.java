package sec08_Date_Time;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeDemo2 {
	public static void main(String[] args) {
		// 한국 출발 현지 시간 2022년 12월 9일 13시 20분
		// 방법1
		ZonedDateTime ko = ZonedDateTime.of(2022, 12, 9, 13, 20, 0, 0, ZoneId.of("Asia/Seoul"));
		System.out.println(ko);
		// 방법2
		ZonedDateTime kk = ZonedDateTime.of(LocalDateTime.of(2022, 12, 9, 13, 20, 0), ZoneId.of("Asia/Seoul"));
		System.out.println(kk);

		// 파리 도착 현지 시간 2022년 12월 9일 17시 15분

		ZonedDateTime pi = ZonedDateTime.of(2022, 12, 9, 17, 15, 0, 0, ZoneId.of("Europe/Paris"));
		System.out.println(pi);

		// 비행에 걸린 시간은?
		Duration between = Duration.between(kk, pi);
		System.out.println("비행에 걸리는 시간 : " + between);

	}
}
