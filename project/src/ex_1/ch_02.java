package ex_1;

import java.util.Scanner;

public class ch_02 {

	public static void main(String[] args) {

		// 키보드로 입력받는 정수 구하기

		// 문제
		// 정수를 입력하세요 : 7
		// 7의 제곱은 49

		Scanner a1 = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int a01 = a1.nextInt();

		System.out.printf("%d의 제곱은 %d", a01, a01 * a01);

	}

}
