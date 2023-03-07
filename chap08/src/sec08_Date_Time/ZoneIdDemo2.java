package sec08_Date_Time;

import java.time.ZoneId;

public class ZoneIdDemo2 {
	public static void main(String[] args) {
		ZoneId.getAvailableZoneIds().stream() // .stream은 데이터 흐름
				.filter(s -> s.startsWith("Asia")) // 필터
				.sorted() // 구분
				.forEach(s -> System.out.println(s)); // 출력
	}
}
