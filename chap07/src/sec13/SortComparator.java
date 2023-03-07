package sec13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortComparator {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("ROBOT");
		list.add("RED");
		list.add("BANANA");
		list.add("CAR");

		StrComp cmp = new StrComp();
		Collections.sort(list, cmp);
		System.out.println(list);
	}
}
