package ex_p208_211;

import java.util.Scanner;

public class _05_2 {
	public static void main(String[] args) {

		int a;

		String[] b = new String[10];

		for (int i = 0; i < b.length; i++)
			b[i] = "";

		System.out.println("0~99까지의 숫자를 입력해주세요.(100이상일시 종료)");
		do {
			a = new Scanner(System.in).nextInt();
			int j = 10;
			if (a < 0) {

			} else if (a >= 0) {
				for (int i = 0; i < 10; i++) {
					if (a < j) {
						b[i] += "*";
						break;
					} else {
						j += 10;
					}
				}
			}
		} while (a < 100);
		System.out.println(" 0~ 9 : " + b[0]);
		System.out.println("10~19 : " + b[1]);
		System.out.println("20~29 : " + b[2]);
		System.out.println("30~39 : " + b[3]);
		System.out.println("40~49 : " + b[4]);
		System.out.println("50~59 : " + b[5]);
		System.out.println("60~69 : " + b[6]);
		System.out.println("70~79 : " + b[7]);
		System.out.println("80~89 : " + b[8]);
		System.out.println("90~99 : " + b[9]);
	}

}
