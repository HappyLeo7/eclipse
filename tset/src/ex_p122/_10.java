package ex_p122;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		System.out.print("양의 정수를 입력하세요 : ");
		int n = new Scanner(System.in).nextInt();
		if (isPrime(n)) {
			System.out.println(n + "는 소수입니다.");
		} else {
			System.out.println(n + "는 소수가 아닙니다.");
		}
	}

	public static boolean isPrime(int n) {
		boolean is = false;
		int count = 0;
		for (int i = 2; i <= n; i++) {
			if ((n % i) == 0) {
				count += 1;

			}

		}
		is = (count == 1) ? true : false;
		return is;
	}

}
