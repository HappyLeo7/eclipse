package sec05_p458;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortDemo {
	public static void main(String[] args) {
		// String 배열 생성
		String[] ff = { "포도", "수박", "사과", "키위", "망고", "딸기", };

		// List화
		List<String> list = Arrays.asList(ff);

		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);

		Collections.reverse(list);
		System.out.println(list);
	}
}
