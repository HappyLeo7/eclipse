package sec07_333;

import java.util.Random;

public class RandomEx {
	public static void main(String[] args) {

		// 프로그램 사용자로 부터 임의의 정수 A와 Z를 입력 받는다.
		// 그리고 A와Z를 포함하여 그 사이에 있는 난수 10개를 생성 하여 출력하는 프로그램 작성해보자.

		Random A = new Random();
		int a = A.nextInt(100);
		Random Z = new Random();
		int z = Z.nextInt(100);

		System.out.println("A값 : " + a);
		System.out.println("Z값 : " + z);

		if (a < z) {
//			int r = a - z; 
			for (int i = a; i <= z; i++) {
				int a1 = i;
				if (a1 > a && a1 < z) {
					int a3 = A.nextInt(a1);
					System.out.println(a3);
				}
//				System.out.println("i: " + i);
//				System.out.println("a1: " + a1);
//					for (int i1 = 0; i1 < 10; i1++) {
//						System.out.print(a1 + " ");
//					}
			}
		}
		if (a > z) {
//			int r = a - z; 
			for (int i = 0; i < 10; i++) {
				int a2 = Z.nextInt(a);
				if (a2 < a && a2 > z) {
					System.out.print(a2 + " ");
				}
			}
		}

//		String q = new Random();
//		System.out.println(q.substring(a,z));

//		}
		// for (int i = 0; i < 1; i++) {
//			System.out.println(A.nextInt(100));
//			Random a = A.nextInt(100);
//			System.out.println(a);
//		}
//
//		for (int i = 0; i < 1; i++) {
//			System.out.println(Z.nextInt(100));
//			Random z = Z;
//			System.out.println(z);
////			System.out.println(.toString(A));
	}
}
