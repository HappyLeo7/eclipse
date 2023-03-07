package sec05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class ConvertCollection {
	public static void main(String[] args) {

		// list
		List<String> list = Arrays.asList("바나나", "사과", "키위", "포도", "사과");

		ArrayList<String> alist = new ArrayList<>(list);
		for (String s : alist) {
			System.out.print(s.toString() + '\t');
		}
		System.out.println();

		// 중복제거
		HashSet<String> set = new HashSet<>(alist);
		for (String s : set) {
			System.out.print(s.toString() + '\t');
		}
		System.out.println();

//set에 사과가없기때문에 사라진다
		alist = new ArrayList<>(set);
		for (String s : set) {
			System.out.print(s.toString() + '\t');
		}
		System.out.println();

	}
}
