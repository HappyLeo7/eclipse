package Sec02;

import java.util.Scanner;

public class OverLoadDemo {

	public static void main(String[] args) {
		Scanner ii = new Scanner(System.in);
		int i1 = ii.nextInt();
		int i2 = ii.nextInt();
		int i3 = ii.nextInt();

//		int i1 = 3, i2 = 7, i3 = 10;
		double d1 = 7.1, d2 = 3.1;

		System.out.printf("max(%d,%d) = %d\n", i1, i2, max(i1, i2));
		System.out.printf("max(%.1f,%.1f) = %.1f\n", d1, d2, max(d1, d2));
		System.out.printf("max(%d,%d,%d) = %d\n", i1, i2, i3, max(i1, i2, i3));
	}

	public static int max(int n, int n2) {
		int re = n > n2 ? n : n2;
		return re;
	}

	public static double max(double n1, double n2) {
		double re = n1 > n2 ? n1 : n2;
		return re;
	}

	public static int max(int n, int n2, int n3) {
//	int re=n1>n2?n1:n2;
		return max(max(n, n2), n3);
	}
}
