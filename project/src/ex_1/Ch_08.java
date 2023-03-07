package ex_1;

import java.util.Scanner;

public class Ch_08 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.print("0~999사이의 숫자를 입력하세요 : ");
		int a = in.nextInt();

		int a100 = a / 100;
		int a10 = a % 100 / 10; // int a10 = (a-100*a100)/10;
		int a1 = a % 10;

		// 다른답안
		// int sum;
		// sum =x%10;
		// x/=10;
		// sum +=x%10;
		// x/=10;
		// sum+=x%10;
		// ("각자리의합=" +sum)

		System.out.printf("%d", a100 + a10 + a1);

	}

}
