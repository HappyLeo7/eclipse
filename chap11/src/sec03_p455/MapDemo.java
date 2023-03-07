package sec03_p455;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	public static void main(String[] args) {

		// of 를 통해서 Map 객체 저장
		Map<String, Integer> fruits = Map.of("사과", 5, "바나나", 3, "포도", 10, "딸기", 1);
		System.out.println(fruits.size() + "종류의 과일이 있습니다.");
		System.out.println(fruits); // {사과=5, 포도=10, 딸기=1, 바나나=3}

		// for 반복을 통해서 하나씩 넣어서 출력
		for (String key : fruits.keySet()) {
			System.out.println(key + "가" + fruits.get(key) + "개 있습니다.");
		}

		//
		String key = "바나나";
		if (fruits.containsKey(key)) {
			System.out.println(key + "가 " + fruits.get(key) + "개 있습니다.");
		}
		fruits.forEach((k, n) -> System.out.print(k + "(" + n + ")"));

		// of 로 객체를 만들면 아래와 같은 추가및 교체 및 삭제가 불가능하다.
		// fruits.put("키위", 2);
		// fruits.remove("사과");
		// fruits.clear();
		System.out.println();
		Map<String, Integer> fMap = new HashMap<>();
		fMap.put("키위", 2);
		fMap.put("배", 6);
		fMap.remove("사과");
		fMap.forEach((k, n) -> System.out.print(k + "(" + n + ")"));
		fMap.clear();
	}
}
