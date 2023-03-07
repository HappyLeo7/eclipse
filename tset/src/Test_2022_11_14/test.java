package Test_2022_11_14;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner ii = new Scanner(System.in);

		// 자연수 2개
		// 자연수의 합
		// 3의 배수 제곱의 합

		int q = ii.nextInt();
		int w = ii.nextInt();
		int x = 0;
		int x1=0;
		if (q > 0 && w > 0) {
			if (q < w) {
				for (int i = 0; i < (w - q) + 1; i++) {
					int z = q + i;
					x += z;
					System.out.print(z + " ");
					if(z%3==0) {
						
						x1 += z*z;
					}
				}
				System.out.println();
				System.out.println("두사이 값 합계 : " + x);
				System.out.println("3의배수 제곱근합 : "+x1);
			} else 
				
				if (q> w) {
				for (int i1 = 0; i1 < (q - w) + 1; i1++) {
					int z = w + i1;
					x += z;
					System.out.print(z + " ");
					if(z%3==0) {
						
						x1 += z*z;
					}
				}
				System.out.println();
				System.out.println("두사이 값 합계: " + x);
				System.out.println("3의배수 제곱근합 : "+x1);
			}
		} else {
			System.out.println("정수를 입력하세요");
		}

	}
}
