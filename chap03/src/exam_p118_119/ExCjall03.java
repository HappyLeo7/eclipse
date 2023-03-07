package exam_p118_119;

public class ExCjall03 {

	public static void main(String[] args) {

		System.out.println("결과값:" + fac(5));
		System.out.println("결과값:" + fac(1, 5));
		System.out.println("결과값:" + fac(3, 5));
		System.out.println("결과값:" + fac1(10, 5));

	}

	static int fac(int x) {
		int r = 1;
		while (x > 0) {
			r = r * x;
			x = x - 1;
		}
		return r;
	}

	static int fac(int x, int y) {
		int r = 1;
		while (x <= y) {
			r = r * x;
			x = x + 1;
		}
		return r;
	}

	static int fac1(int x, int y) {
		int r = 1;
		while (x >= y) {
			r = r * x;
			x = x - 1;
		}
		return r;
	}

}
