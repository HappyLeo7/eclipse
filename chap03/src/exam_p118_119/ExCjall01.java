package exam_p118_119;

import java.util.Scanner;

public class ExCjall01 {

	public static void main(String[] args) {

		int result;
		int n;

		Scanner in = new Scanner(System.in);
		//
		System.out.println("팩토리얼 값을 구할 정수: ");
		n = in.nextInt();

		result = 1;
//		while (n > 0) {
//			result = result * n;
//			n = n - 1;
//			System.out.println("result:" + result);
//		}

		while (true) {
			result = result * n;
			n = n - 1;
			if (n == 0) {
				break;
			}

		}
		//

		System.out.println(result);

	}

}
