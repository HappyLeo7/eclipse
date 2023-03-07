package ex_1;

import java.util.Scanner;

public class ch02 {

	public static void main(String[] args) {

		// int x;
		Scanner sniffling = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		int x = sniffling.nextInt();

		System.out.printf((x % 2 == 0) ? "짝수" : "홀수");

		/*
		 * if (x % 2 == 0)
		 * 
		 * System.out.println("짝수"); else
		 * 
		 * System.out.println("홀수");
		 */
		double y = 5 % 2;
		System.out.println(y);

	}

}
