package Sec01;

import java.util.Scanner;

public class Control01 {
	public static void main(String[] args) {

		Scanner inScanner = new Scanner(System.in);
		System.out.print("정수를 입력하면 홀수인지 짝수인지 알 수 있습니다. : ");
		int number = inScanner.nextInt();

//		if (number % 2 == 0)
//			System.out.println("입력하신 정수는 \"짝수\" 입니다.");
//		if (number % 2 == 1)
//			System.out.println("입력하신 정수는 \"홀수\" 입니다.");
//
//		System.out.println("사용해주셔서 감사합니다.");

		if (number % 2 == 0) {
			System.out.println("입력하신 정수는 \"짝수\" 입니다.");
			System.out.println("입력");
		} else {
			System.out.println("입력하신 정수는 \"홀수\" 입니다.");
		}

		System.out.println("사용해주셔서 감사합니다.");

	}
}
