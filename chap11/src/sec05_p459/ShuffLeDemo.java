package sec05_p459;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffLeDemo {
	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();

		// for 을 사용해서 char 타입의 변수 c에 A부터 G까지 넣는다.
		for (char c = 'A'; c <= 'G'; c++) {
			list.add(c);
			System.out.println(c);
		}
		System.out.println("최초 리스트 : \t" + list);

		// 오른쪽으로 하나씩 돌린다. 값에 따라서 달라진다
		Collections.rotate(list, 3);
		System.out.println("돌린 리스트 : \t" + list);

		Collections.shuffle(list);
		System.out.println("섞은 리스트 : \t" + list);

	}
}
