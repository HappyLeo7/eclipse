package chap11HoSeong;

import java.util.ArrayList;
import java.util.List;

public class ArrayList1 {
	public static void main(String[] args) {
		// 값 add로 넣음
		List<String> capitals = new ArrayList<>();
		capitals.add("서울");
		capitals.add("워싱턴");
		capitals.add("베이징");
		capitals.add("파리");
		capitals.add("마드리드");

		capitals.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// 런던 추가
		capitals.add("런던");
		capitals.forEach(s -> System.out.print(s + " "));
		System.out.println();

		// 문자 길이가 3보다 크거나 같으면 삭제
		capitals.removeIf(c -> c.length() >= 3);
		capitals.forEach(s -> System.out.print(s + " "));

	}
}
