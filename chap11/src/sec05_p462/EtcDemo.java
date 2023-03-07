package sec05_p462;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EtcDemo {
	public static void main(String[] args) {
		List<String> l1 = List.of("사과", "포도", "수박", "사과", "키위", "포도", "망고", "사과", "사과", "포도", "수박", "사과", "55");

		HashSet<String> set = new HashSet<>(l1);

		List<String> l2 = new ArrayList<>(set);
		Collections.sort(l2);

		for (String f : l2) {
			System.out.printf("%s : %d\n", f, Collections.frequency(l1, f)); // frequency는 중복되는 원소의 빈도수를 체크
		}

	}
}
