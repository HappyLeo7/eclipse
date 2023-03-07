package sec03_p452;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		// Set 클래스를 사용하여 set 리스트 만들기
		Set<String> set = Set.of("포도", "수박", "사과", "키위", "망고");
		HashSet<String> hashset = new HashSet<>(set);
		System.out.println(hashset);

		TreeSet<String> treeset = new TreeSet<>(set);
		System.out.println(treeset);

		System.out.println(treeset.first());
		System.out.println(treeset.last());
		System.out.println(treeset.lower("사과"));
		System.out.println(treeset.higher("사과"));

	}
}
