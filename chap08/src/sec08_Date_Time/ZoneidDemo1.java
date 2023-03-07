package sec08_Date_Time;

import java.time.ZoneId;

///////////////////////////
//세계 시간 나타날때 사용 ZoneID//
///////////////////////////

public class ZoneidDemo1 {
	public static void main(String[] args) {
		ZoneId paris = ZoneId.of("Europe/Paris");
		System.out.println(paris);
	}
}
