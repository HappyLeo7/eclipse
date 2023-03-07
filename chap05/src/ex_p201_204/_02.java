package ex_p201_204;

import java.util.Scanner;

public class _02 {
	public static void main(String[] args) {

		int num = 0;
		int[] scores;
		Scanner in = new Scanner(System.in);

		num = in.nextInt();
		scores = new int[num];

		System.out.println(num + "명의 학생 성적을 입력하세요.");

		// for 을 통해서 점수를 입력받는다
		for (int i = 0; i < num; i++) {
			scores[i] = in.nextInt();
		}

		System.out.println(num + "명의 학생 성적은 다음과 같습니다.");

		// for을 통해서 받아온 점수를 출력한다.
		// for(int 변수: 배열)
		// 아래의 for문을 향상 for문으로 변경
//		for (int i = 0; i < num; i++) {
//			System.out.print(scores[i] + " ");
//		}
		for (int i : scores) {
			System.out.print(i + " ");
		}
		System.out.println();
		// for을 통해서 메서드 추가
		for (int i = 0; i < num; i++) {
			// 90점 이상 A등급
			if (scores[i] >= 90) {
				System.out.println((i + 1) + "번 학생의 등급은 A입니다.");
			}
			// 80이상~90미만 사이 B등급
			else if (scores[i] < 90 && scores[i] >= 80) {
				System.out.println((i + 1) + "번 학생의 등급은 B입니다.");
			}
			// 70이상~80미만 사이 C등급
			else if (scores[i] < 80 && scores[i] >= 70) {
				System.out.println((i + 1) + "번 학생의 등급은 C입니다.");
			}
			// 60이상~70미만 사이 D등급
			else if (scores[i] < 70 && scores[i] >= 60) {
				System.out.println((i + 1) + "번 학생의 등급은 D입니다.");
			}
			// 60미만 F등급
			else if (scores[i] < 60) {
				System.out.println((i + 1) + "번 학생의 등급은 F입니다.");
			}
		}

	}
}
