package sec01_p441;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		String[] animals1 = { "사슴", "호랑이", "바다표범", "곰" };
		List<String> animals2 = Arrays.asList(animals1);
		System.out.println("?? : "+animals2);
		animals2.set(1, "앵무새");

		for (String a : animals2) {
			System.out.print(a + " "); //*출력값 : 사슴 앵무새 바다표범 곰
		}
		System.out.println();

		List<String> animals21 = new ArrayList<>(); // ArrayList 리스트화
		animals21.add("늑대");
		for (String a : animals21) {
			System.out.print(a + " "); //*출력값 : 늑대
		}
		System.out.println();

		animals2.sort((x, y) -> x.length() - y.length());
		String[] animals3 = animals2.toArray(new String[0]); // 배열에 주소값을 넘겨준다.
		for (int i = 0; i < animals3.length; i++) {
			System.out.print(animals3[i] + " "); //*출력값 : 곰 사슴 앵무새 바다표범
		}
		System.out.println();

		List<String> cars = List.of("그랜저", "소나타", "아반테", "제네시스");
//		car.set(1, "싼타페");
		cars.forEach(s -> System.out.print(s + " "));

//		List<Object> ob = List.of("a", null);

	}
}
