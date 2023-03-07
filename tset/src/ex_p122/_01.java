package ex_p122;

import java.util.Scanner;

public class _01 {

	public static void main(String[] args) {

		// if else
		Scanner age1 = new Scanner(System.in);
		System.out.println("나이: ");
		int age = age1.nextInt();

		if (19 < age) {
			System.out.println("당신은 성인 입니다.");
		} else {
			System.out.println("당신은 미성년입니다.");
		}
//		age1.close();   // 입력부분 닫아주는 코드
	}

}
