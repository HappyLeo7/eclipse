package chap10HoSeong.p1;

import java.util.Arrays;

public class SortDemo {

	public static void main(String[] args) {
		String[] strings = { "K", "o", "r", "e", "a", "n" }; // 배열생성

		// 정렬전
		System.out.print("정렬 전 : ");
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}

		System.out.println();

		Sortable s;
//		s = n -> Arrays.sort(n, String.CASE_INSENSITIVE_ORDER); // 람다식
		s = Arrays::sort;
		s.sort(strings, String.CASE_INSENSITIVE_ORDER); // 메서드 참조 정렬

		System.out.print("정렬 후 : ");
		for (int i = 0; i < strings.length; i++) {
			System.out.print(strings[i] + " ");
		}
	}

}
