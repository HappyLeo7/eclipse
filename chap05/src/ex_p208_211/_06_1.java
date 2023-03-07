package ex_p208_211;

import java.util.Arrays;

public class _06_1 {
	public static int[] reverse(int[] org) {

		int l = 0; // int 생성
		int r = org.length - 1; // 길이 생성(안에서 r은 변동되고 length는 변동 안되게

		while (l < r) {
			// 돌리기
			int n = org[l];
			org[l] = org[r];
			org[r] = n;

			l++;
			r--;
		}
		return org;

	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };

		System.out.println(Arrays.toString(reverse(a)));

	}
}
