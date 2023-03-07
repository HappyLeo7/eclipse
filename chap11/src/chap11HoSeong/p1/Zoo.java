package chap11HoSeong.p1;

import java.util.Arrays;
import java.util.List;

public class Zoo {

	public static void main(String[] args) {
		// 생성
		String[] s = { "갈매기", "나비", "다람쥐", "라마" };
		List<String> list = Arrays.asList(s); // List타입의 list에 넣음

		for (String a : list) {
			if (a.length() == 2) { // 길이가 2인것만 골라서 출력
				System.out.println(a + " ");
			}
		}
	}

}
