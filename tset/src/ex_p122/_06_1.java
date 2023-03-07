package ex_p122;

import java.util.Scanner;

public class _06_1 {

	public static void main(String[] agrs) {

		Scanner Game = new Scanner(System.in);
		System.out.println("게임을 입력하세요");
		String Game1 = Game.nextLine();

		if (Game1.equals("가위바위보게임") || Game1.equals("가위바위보")) {
//		System.out.println("가위,바위,보중 하나를를 입력하세요");
			Scanner srp = new Scanner(System.in);

//		static String Game1(System.out.println("게임시작");)

			// srp1 = 철수
			// srp2 = 영희
			System.out.println("게임시작");
			System.out.println("철수 : ");
			String srp1 = srp.nextLine();
			System.out.println("영희 : ");
			String srp2 = srp.nextLine();
//		public static int srp(int A, int B) {}
			if (srp1.equals("가위") || srp1.equals("보") || srp1.equals("바위") && srp2.equals("가위") || srp2.equals("보")
					|| srp2.equals("바위")) {
				if (srp1.equals("바위") && srp2.equals("가위")) {
					System.out.println("철수(바위) 승");
				}
				if (srp1.equals("바위") && srp2.equals("바위")) {
					System.out.println("무승부");
				}
				if (srp1.equals("바위") && srp2.equals("보")) {
					System.out.println("영희(보) 승");
				}
				//
				if (srp1.equals("가위") && srp2.equals("가위")) {
					System.out.println("무승부");
				}
				if (srp1.equals("가위") && srp2.equals("바위")) {
					System.out.println("영희(바위) 승");
				}
				if (srp1.equals("가위") && srp2.equals("보")) {
					System.out.println("영철(가위) 승 ");
				}
				//
				if (srp1.equals("보") && srp2.equals("가위")) {
					System.out.println("영희(가위) 승");
				}
				if (srp1.equals("보") && srp2.equals("바위")) {
					System.out.println("영철(보) 승");
				}
				if (srp1.equals("보") && srp2.equals("보")) {
					System.out.println("무승부");

				}
			} else {
				System.out.println("다시입력하세요");
			}

		} else {
			System.out.println("찾을 수 없습니다.");
		}
	}
}

//		if (srp1 == 1) {
//		}
//
//		if (srp1 == 2) {
//			System.out.println("보");
//		}

// public static void equals(srp1) {

//	}

//		String c = input("철수");
//		String c = input("영희");
//		whosWin(c, y);
//
//	
//
//	public static void ex_07(String c, String y) {
//}
