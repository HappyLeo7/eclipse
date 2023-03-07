package sec08_Date_Time;

import java.time.Duration;
import java.time.LocalTime;

public class LocalTimeDemo2 {
	public static void main(String[] args) {
		// pc방 현재 시각
		LocalTime pcRoomNow = LocalTime.of(13, 25, 30);
		System.out.println("pc방 현재 시각 : " + pcRoomNow);

		// pc방 이용종료 시각
		LocalTime pcEnd = LocalTime.of(15, 22, 10);
		System.out.println(pcEnd);

		// pc방 이용시간 계산
		Duration between = Duration.between(pcRoomNow, pcEnd);
		System.out.println("이용시간 : " + between);
	}
}
