package exam_p118_119;

import java.util.Scanner;

public class ExCjall02 {

	public static void main(String[] args) {

		int result;
		int n;

		Scanner in = new Scanner(System.in);
		//
		System.out.println("팩토리얼을 구할 정수: ");
		n = in.nextInt();
		result = factorial(n);

		System.out.println(result);

	}

	static int factorial(int x) {
		int r = 1;
		while (x > 0) {
			r = r * x;
			x = x - 1;
		}
		return r;

	}

}
