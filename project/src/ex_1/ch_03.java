package ex_1;

import java.util.Scanner;

public class ch_03 {

	public static void main(String[] args) {

		Scanner o = new Scanner(System.in);
		System.out.print("원기둥의 밑면 반지름은 ? ");
		double d = o.nextDouble();

		System.out.print("원기둥의 높이는 ? ");
		double h = o.nextDouble();

		System.out.printf("원기둥이 부피는 %.1f", d * d * h * 3.14);

	}

}
