package chap11HoSeong.p3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapTest {

	public static void main(String[] args) {
		System.out.print("이름을 입력하세요 : ");
		String in = new Scanner(System.in).next(); // 스캐너 받음
		Map<String, Integer> map = new HashMap<>(); // 맵 타입 생성

		map.put("김열공", 80); // 키와 벨류 값 넣음
		map.put("최고봉", 90);
		map.put("우등생", 95);
		map.put("나자바", 88);

		if (map.containsKey(in)) { // 맵에서 키값만 출력하여 스캐너 받은 값인 in과 같은지 비교
			System.out.println(map.get(in)); // 같다면 벨류값만 출력
		} else {
			System.out.println("이름이 틀렸습니다."); // 틀리면 틀렸습니다 출력
		}
	}

}
