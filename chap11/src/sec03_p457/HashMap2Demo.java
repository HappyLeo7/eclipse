package sec03_p457;

import java.util.HashMap;
import java.util.Map;

public class HashMap2Demo {
	public static void main(String[] args) {
		Map<Fruit, Integer> map = new HashMap<>();

		// 키는 중복이 안되지만 벨류는 중복이 가능하다.
		map.put(new Fruit("사과"), 5);
		map.put(new Fruit("사과"), 2);
		map.put(null, 3);
		System.out.println(map.size());
		System.out.println(map);

	}
}
