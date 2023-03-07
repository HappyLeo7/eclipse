package sec02_362;

import java.util.Scanner;

public class ThrowsDemo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		try {
			square(in.nextLine());
		} catch (NumberFormatException e) { // NumberFormatException
			System.out.println(e + "정수가 아닙니다.");
		}
	}

	private static void square(String s) throws NumberFormatException { // throws는 책임전과 상위 클래스로 (main)에게 전과시켜서 처리하게함
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}

}
