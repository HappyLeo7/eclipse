package Sec02;

public class Method01 {

	public static void main(String[] args) {

//		int sum = 0;
//		for (int i = 10; i <= 100; i++)
//			sum += i;
//		System.out.println(sum);

		// 출력내용 작성
		System.out.println("합 1~10 : " + sum(1, 10));
		System.out.println("합 10~100 : " + sum(10, 100));
		System.out.println("합 100~1000 : " + sum(100, 1000));
	}

	// 메서드 작성
	public static int sum(int i1, int i2) {
		int a = 0;
		for (int p = i1; p <= i2; p++)
			a += p;

		return a;
	}

}
