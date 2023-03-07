package exx01_O;

import java.util.Arrays;

public class ArraysTest {
	public static void main(String[] args) {
		System.out.print("정렬 전 : ");

		String[] s = { "K", "o", "r", "e", "a", "n" };

		for (String a : s) {
			System.out.print(a + " ");
		}
		System.out.println();

		Arrays.sort(s, String.CASE_INSENSITIVE_ORDER); // String.CASE_INSENSITIVE_ORDER 대소문자 구분 없이 배열
		System.out.print("정렬 후 : ");
		for (String a1 : s) {
			System.out.print(a1 + " ");
		}

	}
}
