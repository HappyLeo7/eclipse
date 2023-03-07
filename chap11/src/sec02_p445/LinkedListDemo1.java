package sec02_p445;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo1 {
	public static void main(String[] args) {
		List<String> list = List.of("그랜저", "소나타", "아반테", "제네시스", "소울"); // List<String>타입의 of를 사용하여 리스트나열

		System.out.println(list.indexOf("소나타"));// 1
		System.out.println(list.contains("싼타페"));// false

		List<String> cars1 = new LinkedList<>(list);
		cars1.add("싼타페");
		List<String> cars2 = new LinkedList<>(list);
		cars2.remove("제네시스");
		System.out.println(cars1.containsAll(cars2)); // true

		cars1.removeIf(c -> c.startsWith("소"));
		cars1.replaceAll(s -> "뉴" + s);
		cars1.forEach(s -> System.out.print(s + " ")); // 뉴그랜저 뉴아반테 뉴제네시스 뉴싼타페
		System.out.println();

		cars1.clear();
		System.out.println(cars1.isEmpty()); // true

	}
}
