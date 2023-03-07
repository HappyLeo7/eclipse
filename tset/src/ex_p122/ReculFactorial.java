package ex_p122;

public class ReculFactorial {

	public static void main(String[] args) {
		System.out.println(factorial(5));
	}

	public static int factorial(int i) {

		if (i == 1) {

			return 1;
		} else {
			return i * factorial(i - 1); // 재귀호출 (메서드를 다시 부르는 것을 의미)
		}
	}

}
