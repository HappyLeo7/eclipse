package sec03;

public class _01IncrementDemo {
	public static void main(String[] args) {
		int[] x = { 0 };
		int y = 0;
		System.out.println("호출 전의 x[0]= " + x[0] + ", y = " + y);

		increment(x, y);
		System.out.println("호출 후의 x[0]= " + x[0]);
	}

	static void increment(int[] n, int y) {
		System.out.println("increment() 메서드 안에서");
		System.out.println("n[0] = " + n[0] + "--->");
		n[0]++;
		System.out.println("n[0]= " + n[0]);

		System.out.println("y = " + y + "--->");
		y++;
		System.out.println("y = " + y);
	}
}
