package sec03;

public class _03LocalVariableDemo {

	public static void main(String[] args) {
		int a = 0;
		double b;

		// System.out.println(b); // 초기화값이 없어서
		// System.out.println(a+c); //c는 변환선언이 안되어있음

		int c = 0;
		// public double d = 0.0; //지역변수는 public으로 지정 불가

		for (int e = 0; e < 10; e++) {
			// int a =1;
			System.out.print(e);
		}
	}
}
