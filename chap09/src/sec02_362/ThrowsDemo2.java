package sec02_362;

import java.util.Scanner;

public class ThrowsDemo2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		square(in.nextLine());

//		try {
//		} catch (NumberFormatException e) {
//			System.out.println("정수가 아닙니다.");
//		}
	}

	private static void square(String s) {

//		int n = 0;
//		try {
//			n = Integer.parseInt(s);
//		} catch (NumberFormatException e) {
//			System.out.println("정수가 아닙니다.");
//		} finally {
//
//			System.out.println(n * n);
//		}
//	}
//////////////////////위아래 같음///////////////////
		try {
			int n = Integer.parseInt(s);
			System.out.println(n * n);
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		}
	}

}
