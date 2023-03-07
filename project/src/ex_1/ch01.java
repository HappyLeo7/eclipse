package ex_1;

import java.util.Scanner;

public class ch01 {

	public static void main(String[] args) {

		double w, h, area;
		Scanner in = new Scanner((System.in));
		System.out.printf("직사각형의 가로 길이를 입력하세요 : ");
		w = in.nextDouble();
		System.out.printf("직사각형의 세로 길이를 입력하세요 : ");
		h = in.nextDouble();
		// area = in.nextDouble();
		System.out.printf("가로는 %4.1f , 세로는 %4.1f, 넓이는 %4.1f", w, h, w * h);

	}

}
