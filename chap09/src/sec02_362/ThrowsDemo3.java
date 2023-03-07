package sec02_362;

import java.util.Scanner;

public class ThrowsDemo3 {
	public static void main(String[] args) throws NumberFormatException {
		Scanner in = new Scanner(System.in);
		square(in.nextLine());

//		try {
//		} catch (NumberFormatException e) { // NumberFormatException
//			System.out.println(e + "정수가 아닙니다.");
//		}
	}

	private static void square(String s)
//			throws NumberFormatException 
	{ // throws는 책임전과 상위 클래스로 (main)에게 전과시켜서 처리하게함
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}

}
