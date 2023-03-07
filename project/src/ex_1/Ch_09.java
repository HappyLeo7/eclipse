package ex_1;

import java.util.Scanner;

public class Ch_09 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("전공 이수 학점 : ");
		int A = in.nextInt();
		System.out.print("교양 이수 학점 : ");
		int B = in.nextInt();
		System.out.print("일반 이수 학점 : ");
		int C = in.nextInt();

		System.out.println("전공 이수 학점 : " + A);
		System.out.println("교양 이수 학점 : " + B);
		System.out.println("일반 이수 학점 : " + C);
		System.out
				.println((A >= 70) && ((B >= 30 && C >= 30) || (B + C >= 80)) && (A + B + C >= 140) ? "졸업가능" : "졸업불가");

	}

}
