package sec04;

import java.util.Scanner;

public class ScannerStringDemo {

	public static void main(String[] args) {
		/*
		 * Scanner aa = new Scanner(System.in);
		 * 
		 * System.out.print("문자열 입력: "); String str1 = aa.nextLine();
		 * 
		 * System.out.print("문자열 입력: "); String str2 = aa.nextLine();
		 * 
		 * System.out.printf("입력된 문자열 1: %s \n", str1);
		 * System.out.printf("입력된 문자열 2: %s \n", str2);
		 */
		Scanner aa = new Scanner(System.in);
		System.out.print("문자열 입력: ");
		String st1 = aa.nextLine();
		String st2 = aa.nextLine();

		System.out.printf("입력된 문자 1:");
		System.out.printf("입력된 문자 2:");

	}

}
