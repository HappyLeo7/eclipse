package sec08_Date_Time;

import java.time.Duration;
import java.time.LocalDateTime;

public class DurationDemo {
	public static void main(String[] args) {
		LocalDateTime dt1 = LocalDateTime.of(2022, 01, 12, 15, 30); // of 를사용해서 날짜 직접입력
		LocalDateTime dt2 = LocalDateTime.of(2022, 02, 12, 15, 30); // of 를사용해서 날짜 직접입력

		LocalDateTime dt3 = LocalDateTime.of(2022, 01, 12, 15, 30); // of 를사용해서 날짜 직접입력
		LocalDateTime dt4 = LocalDateTime.of(2022, 02, 13, 17, 15); // of 를사용해서 날짜 직접입력

		System.out.println(dt1);
		System.out.println(dt2);
		System.out.println(dt3);
		System.out.println(dt4);

/////////////////////////////////////////////////////////////////////////
		// LocalDateTime 때에 Duration 사용 가능하나 Period 는 사용 불가
		Duration date = Duration.between(dt1, dt2);
		System.out.println(date);

		Duration date1 = Duration.between(dt3, dt4);
		System.out.println(date1);

//		Period day = Period.between(dt1, dt2);
/////////////////////////////////////////////////////////////////////////
	}
}
