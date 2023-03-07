package exx06;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {
	// [결과값]
	// 2017.06.15 오후 15:35:40
	// 오늘은 6월의 15번째 날
	// 오늘은 2017년의 166번째 날

	public static void main(String[] args) {
		// 오늘날짜 day로 생성
		Date day = new Date();

//		 SimpleDateFormat를 생성
		SimpleDateFormat s1 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
		System.out.println(s1.format(day));
		SimpleDateFormat s2 = new SimpleDateFormat("오늘은 M월의 d번째 날");
		System.out.println(s2.format(day));
		SimpleDateFormat s3 = new SimpleDateFormat("오늘은 y년의 D번째 날");
		System.out.println(s3.format(day));

//		LocalDateTime d = LocalDateTime.of(2017, 06, 15, 15, 35, 40);
//		// SimpleDateFormat를 생성
//		SimpleDateFormat s1 = new SimpleDateFormat("yyyy.MM.dd a HH:mm:ss");
//		System.out.println(s1.format(d));
//		SimpleDateFormat s2 = new SimpleDateFormat("오늘은 M월의 d번째 날");
//		System.out.println(s2.format(d));
//		SimpleDateFormat s3 = new SimpleDateFormat("오늘은 y년의 D번째 날");
//		System.out.println(s3.format(d));

	}
}
