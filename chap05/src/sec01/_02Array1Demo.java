package sec01;

import java.util.Scanner;

public class _02Array1Demo {

	public static void main(String[] agrs) {
		Scanner in = new Scanner(System.in);
		int ss[] = new int[4];
		int sum = 0;

		for (int i = 0; i < ss.length; i++)
			ss[i] = in.nextInt();
		for (int i = 0; i < ss.length; i++)
			sum += ss[i];
		double length;
		System.out.println("평균= " + sum / 5.0);
		System.out.println("평균= " + sum / ss.length);

	}

}
//	int[] ss = {100,90,50,40,50,100};
//	int sum =0;
//	
//	for (int i=0;i<5;i++)
//		sum += ss[i];
//	double aa=sum/5.0;
