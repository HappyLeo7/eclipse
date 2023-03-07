package sec04;

import java.util.Scanner;

public class ArithmeticDemo {

	public static void main(String[] args) {
		/*
		 * int remainder = 25 % 2; System.out.println("25/2의 나머지는 " + remainder +
		 * "입니다.");
		 * 
		 * int c = 24 % 2; System.out.println("24/2의 나머지는 " + c + "이므로 짝수입니다.");
		 * 
		 * int a = 25 % 3; System.out.println("25/3의 나머지는 " + a + "이므로 3의 배수가 아니다.");
		 * 
		 * int b = 9 % 3; System.out.println("9/3의 나머지는 " + b + "이므로 3의 배수이다.");
		 * 
		 * 
		 * Scanner aa = new Scanner(System.in); System.out.print("숫자입력 : "); int x =
		 * aa.nextInt(); remainder = x % 2; System.out.println((remainder == 0) ? "짝수" :
		 * "홀수");
		 */

		Scanner aaa = new Scanner(System.in);
		System.out.print("숫자입력: ");

		int n1 = aaa.nextInt();
		int n2 = aaa.nextInt();
		double a = (double) n1 / (double) n2;
		System.out.println("n1/n2=" + a);

	}

}
