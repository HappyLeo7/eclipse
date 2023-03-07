package Sec02_ex;

import java.util.Scanner;

public class ex_001 {
	public static void main(String[] args) {

//		int n; // 키보드에서 입력받을 정수

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int result = 1; // 팩토리얼 결괏값

//		for (int i = n; i > 0; i--) {
//		for (int i = 1; i <= n; i++) {

//		while (n > 0) {
//
//			result = result * n;
//			n--;
//
//		}

		while (true) {

			result = result * n;

			n--;

			if (n == 0) {
				System.out.println("n=" + n);
				System.out.println("result=" + result);
				System.out.println(result);
				break;
			}
//			else

		}
	}
}