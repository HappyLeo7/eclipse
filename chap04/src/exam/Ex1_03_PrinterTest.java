package exam;

import java.util.Scanner;

public class Ex1_03_PrinterTest {
	public static void main(String[] args) {
		Ex1_01_Printer printer = new Ex1_01_Printer(); // 클래스

		int a;
		int b = 0;
//		int c = 0;
//		do {
		System.out.println("용지를 몇장 추가하시겠습니다?"); // 멘트
		Scanner m = new Scanner(System.in); // 용지 추가

		a = m.nextInt();// 입력
		printer.setNumOfPapers(a);// 입력 //printer 객체 인스턴스
		printer.show(a);

		System.out.println("용지를 몇장 출력하시겠습니다?");// 멘트
		b = m.nextInt();
//		Scanner n = new Scanner(System.in); // 용지 출력
		printer.print(b);// 입력

		System.out.println("용지를 몇장 출력하시겠습니다?");// 멘트
		b = m.nextInt();
		printer.print(b);// 입력

		// nn = printer.print(n.nextInt());
//		System.out.printf("용지 %d장 출력되었습니다.\n", printer.numOfPapers);

//		printer.numOfPapers(10);

//		} while (!(c == 1));
	}
}
