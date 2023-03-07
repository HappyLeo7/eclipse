package Sec02_ex;

import java.util.Scanner;

public class Ex_002 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("팩토리얼값: ");
		int n = in.nextInt();

		int result = fac(n); // 팩토리얼 결괏값

		System.out.println(result);
	}

	static int fac(int x) {
		int r = 1;

		while (x > 0) {

			r = r * x;
			x--;
		}
		return r;
	}

}
