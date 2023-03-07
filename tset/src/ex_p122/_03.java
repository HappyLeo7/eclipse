package ex_p122;

import java.util.Scanner;

public class _03 {

	public static void main(String[] args) {

		int n = 0;
		int s = 0;
		Scanner in = new Scanner(System.in);
		do {
			System.out.print("양의 정수를 입력하세요 : ");
			n = in.nextInt();
			if (n % 2 == 0)
				s += n;

		} while (n >= 0);
		System.out.println(s);
	}

}
