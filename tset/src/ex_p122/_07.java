package ex_p122;

import java.util.Scanner;

public class _07 {

	public static void main(String[] args) {
		String c = input("철수"); // c 변수 , input() 메서드
		String y = input("영희"); // y 변수 , input() 메서드
//		whoswin(c, y);

	}

	static String input(String name) {
		Scanner sc = new Scanner(System.in);
		System.out.println(name + ":");
		String rsp;
		rsp = sc.next();
		return rsp;
	}

}
