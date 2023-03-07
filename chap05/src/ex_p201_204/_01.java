package ex_p201_204;

import java.util.Scanner;

public class _01 {
	public static void main(String[] args) {

		int num = 0; // 학생수
		int[] scores; // 점수
//		String[] ss;
		Scanner in = new Scanner(System.in);

		num = in.nextInt();
		scores = new int[num];
//		scores = new int[] { 100, 90, 80 };
//		scores = new int[] { in.nextInt() };

		// ss = new String[] { in.nextLine() };

		System.out.println("학생수 : " + num);
		for (int i = 0; i < num; i++) {
//			scores = new int[] { in.nextInt() };
			scores[i] = in.nextInt();
//			scores[i] = in.nextInt();

		}
		System.out.println(num + "명의 학생 성적은 다음과 같습니다.");
		for (int i = 0; i < num; i++) {
			System.out.print(scores[i]);
//			scores[i];
//			System.out.print(scores);
			;
		}

	}
}
