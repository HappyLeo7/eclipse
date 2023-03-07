package ex_p208_211;

import java.util.Scanner;

public class _05_3 {

	public static void main(String[] args) {
		int x = 0;
		Scanner in = new Scanner(System.in);
		int[] f = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		System.out.println("숫자를 10개 입력하세요.");

		for (int i = 0; i < 10; i++) {
			x = in.nextInt();
			if (x >= 0)
				f[x / f.length]++;
		}
		for (int i = 0; i < f.length; i++) {
			System.out.printf("%2d ~ %2d : ", i * 10, (i + 1) * 10 - 1);
			for (int k = 0; k < f[i]; k++)
				System.out.print("*");
			System.out.println();
		}
	}
}
