package ex;

public class _11 {

	public static void mian(String[] agrs) {
		// 기본값
		System.out.println("10~100의 합" + sum(10, 100));

	}

	// 메서드
	public static int sum(int i, int j) {
		int a = 0;
		for (int c = i; c <= j; c++)
			a = c;
		return a;

	}

}
