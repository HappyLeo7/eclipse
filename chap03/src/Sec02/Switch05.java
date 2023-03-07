package Sec02;

import java.util.Scanner;

public class Switch05 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("학점: ");
		int m = in.nextInt();
		int n = m / 10;

		System.out.println(so(n) + "입니다");
	}

	static String so(int n) {
		return switch (n) {
		case 10 -> "A";
		case 9 -> "A";
		case 8 -> "B";
		case 7 -> "C";
		case 6 -> "D";
		default -> "F";
		};
	}

}

//Scanner in = new Scanner(System.in);
//System.out.print("학점: ");
//int m = in.nextInt();
//int n = m / 10;
//
//
//System.out.println(score(n) + "입니다.");
//}
//
//static String score(int n) {
//return switch (n) {
//case 10, 9 -> "A학점";
//case 8 -> "B학점";
//case 7 -> "C학점";
//case 6 -> "D학점";
//default -> "F학점";
//};