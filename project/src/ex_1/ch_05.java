package ex_1;

import java.util.Scanner;

public class ch_05 {

	public static void main(String[] args) {

		Scanner st = new Scanner(System.in);
		System.out.print("입력하세요 : ");

		String a = st.next();
		char x = a.charAt(0);

		int y = (int) 'A' - (int) 'a';
		System.out.println(y);
		System.out.printf("실행 값은 %s 대문자로 출력값은 %s", x, (char) (x + y));

//		System.out.println(a);
//		a1 = (int)a ;
//		System.out.println(a1);
//		int A = (int) 'A';
//		System.out.println(A);
//		System.out.println(a1 - A);
	}

}
