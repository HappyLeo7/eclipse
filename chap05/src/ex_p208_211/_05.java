package ex_p208_211;

import java.util.Scanner;

public class _05 {

	public static void main(String[] args) {
		System.out.println("숫자를 10개 입력하세요.");
		int i = 0;
		int x = 0;
		Scanner in = new Scanner(System.in);
		while (true) {
			if (i < 10) {
				break;
			}

			int mm = in.nextInt();
			if (x >= 0) {
				i++;
				System.out.println(i);
			}
		}
	}
}
