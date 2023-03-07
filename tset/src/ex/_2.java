package ex;

import java.util.Scanner;

public class _2 {

	// 홀짝 판별 게임System

	public static void main(String[] agrs) {
		Scanner a1 = new Scanner(System.in);
		System.out.print("입력 : ");
		String a = a1.nextLine();
		if (a.equals("구구단")) {
			System.out.println("구구단을 표시");
			for (int i = 2; i < 10; i++) {
				for (int o = 1; o < 10; o++) {
					System.out.printf("%dX%d=%d", i, i, o, i * o);

				}
				System.out.println();
			}
		} else {
			System.out.println("알 수 없습니다.");
		}

		// if () {} else {}

	}
}
