package Sec02;

public class Continue {

	public static void main(String[] args) {

		// 5의 배수 7의 배수 출력

		int i = 0;
		int j = 0;
		while ((i++) < 1000) {
			if (!((i % 5 == 0) && (i % 7 == 0))) {
				continue;
			}
			j++;
			System.out.printf("5의배수 7의배수인 정수 : %d\n", i);
		}
		System.out.println("count: " + j);

//		for (int i = 0; i < 10; i++) {
//			if (i % 2 == 0)
//				continue;
//			System.out.println(i);
	}
}
