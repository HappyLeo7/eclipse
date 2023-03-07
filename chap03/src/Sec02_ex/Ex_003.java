package Sec02_ex;

public class Ex_003 {

	public static void main(String[] args) {

//		Scanner in = new Scanner(System.in);
//		System.out.print("팩토리얼값: ");
//		int n = in.nextInt();
//		
//		int result = fac(n); // 팩토리얼 결괏값
//		
//		System.out.println(result);
		System.out.println("결과값:" + fac(5, 0));
		System.out.println("결과값:" + fac(1, 5));
		System.out.println("결과값:" + fac(3, 5));
		System.out.println("결과값:" + fac(10, 5));

	}

	static int fac(int x, int y) {
		int r = 1;

//		System.out.println("x=" + x);
//		System.out.println("y=" + y);
		while (y > 0) {

			r = (r * x) + (r * y);
			x--;
			y--;

		}
		return r;
	}

}
