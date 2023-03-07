package sec03;

public class _190VarArgsDemo {
	public static void main(String[] args) {
		printSum("+", 1, 2, 3, 4, 5);
		printSum("-" + 10, 20, 30);
		System.out.println(String.format("My score is %.1f ", 99.8));
		System.out.println(String.join(", ", "one", "two", "three"));

	}

	// 가변 개수 매개변수는 1개만 쓸수있따. 가변 매개 변수는 int... v
	// 매개변수를 2개 이상 쓸경우 가변갯수매개변수는 맨 마지막에 둔다.
	public static void printSum(String op, int... v) { // int... 은 뒤에 가변변수가 몇개든 들어와라란 의미
		int sum = 0;
		for (int i : v) {
			if (op.equals("+"))
				sum += i;
			else
				sum -= i;
		}
		System.out.println(sum);

	}
}
