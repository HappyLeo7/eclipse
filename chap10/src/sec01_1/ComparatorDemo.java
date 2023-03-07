package sec01_1;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorDemo {
	public static void main(String[] args) {
		String[] strings = { "로마에 가면 로마법을 따르라.", "시간은 금이다.", "펜은 칼보다 강하다." };
		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String o, String o1) {
				return o.length() - o1.length();

			}
		});
		for (String s : strings)
			System.out.println(s);
	}
}
