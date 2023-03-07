package sec01_p411_문자사이에_특정문자_나열하는법;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		Collection<String> list = Arrays.asList("다람쥐", "개구리", "나비");

		Iterator<String> iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "-");
		}
		System.out.println();

		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "+");
		}
		System.out.println();
///////////////////////////////for문으로 처리/////////////////////////////////////
		Collection<String> collection = Arrays.asList("다람쥐", "개구리", "나비");
		for (String s : collection) {
			System.out.print(s + "+");
		}
		System.out.println();
////////////////////////////////////////////////////////////////////////
		iterator = list.iterator();
		while (iterator.hasNext()) {
			System.out.print(iterator.next() + "=");
		}
	}
}
