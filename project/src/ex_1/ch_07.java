package ex_1;

import java.util.Scanner;

public class ch_07 {

	public static void main(String[] args) {

		int x;
		Scanner Sc = new Scanner(System.in);
		System.out.print("정수 입력 :");
		x = Sc.nextInt();

		System.out.println(x % 4 == 0 && x % 5 == 0 ? "true" : "false");
		System.out.println(x % 4 == 0 || x % 5 == 0 ? "true" : "false");
		System.out.println(x % 4 == 0 ^ x % 5 == 0 ? "true" : "false"); // 같은식 System.out.println((x % 4 == 0 || x % 5
																		// ==
																		// 0)&& !(x % 4 == 0 && x % 5 == 0));

		System.out.println((x % 4 == 0 || x % 5 == 0) && !(x % 4 == 0 && x % 5 == 0));
		// 4&5
		// 4|5
		//

	}

}
