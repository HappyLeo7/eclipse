package sec04;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int x = in.nextInt();
		int y = in.nextInt();

		System.out.printf("%d*%d는 %d입니다.", x, y, x * y);

		Scanner nn = new Scanner(System.in);
		double i = nn.nextDouble();
		double u = nn.nextDouble();
		System.out.printf("%f+%f = %f 입니다.", i, u, i + u);

	}

}
