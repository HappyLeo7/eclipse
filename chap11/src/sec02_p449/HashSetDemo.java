package sec02_p449;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetDemo {
	public static void main(String[] args) {
		String[] fruits = { "사과", "바나나", "포도", "수박" };
		Set<String> h1 = new HashSet<>();
		Set<String> h2 = new HashSet<>();

		for (String s : fruits) {
			h1.add(s);
		}
		System.out.println("1단계 : " + h1); // Set에서는 무작위로 add된다.

		h1.add("바나나");// 중복이 안되어서 들어갈수 없음
		h1.remove("포도"); // 포도 제거
		h1.add(null); // 포도가 사라지고 null이 들어감

		System.out.println("2단계 : " + h1);
		System.out.println(h1.size()); // 4개
		System.out.println(h1.contains("수박")); // 수박이 들어있니? true

		List<String> list = Arrays.asList(fruits);
		h2.addAll(list);
		System.out.println("3단계 : " + h2);
		h2.clear();
		System.out.println(h2.isEmpty());

	}
}
