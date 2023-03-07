package ex_1;

import java.util.Scanner;

public class ch_04 {

	public static void main(String[] args) {

		Scanner st = new Scanner(System.in);
		System.out.print("초 단위 정수를 입력하세요 : ");

		int s1 = st.nextInt();
		int h = s1 / (60 * 60);
		int m = s1 / 60 - (h * 60);
		int s = s1 % 60;

		System.out.printf("%d시 %d분 %d초\n", h, m, s);

		System.out.print("초 단위 정수를 입력하세요 : ");
		int a = st.nextInt();
		System.out.println(a / 3600 + "시간" + a % 3600 / 60 + "분" + a % 60);

	}

}
