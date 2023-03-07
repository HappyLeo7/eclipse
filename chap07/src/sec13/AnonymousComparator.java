package sec13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousComparator {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("RED");
		list.add("BANANA");
		list.add("CAR");

//		StrComp cmp = new StrComp();
		Comparator<String> cmp = new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.length() - o2.length();
			}
		}; // 익명 클래스

		Collections.sort(list, cmp);
		System.out.println(list);
	}
}
