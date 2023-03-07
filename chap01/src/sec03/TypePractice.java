package sec03;

public class TypePractice {

	public static void main(String[] args) {

		System.out.println("Byte의 최소값 : " + Byte.MIN_VALUE);
		System.out.println("Byte의 최대값 : " + Byte.MAX_VALUE);

		System.out.println("Short의 최소값 : " + Short.MIN_VALUE + "(-32,768)");
		System.out.println("Short의 최대값 : " + Short.MAX_VALUE + "(32,767)");

		System.out.println("Integer의 최소값 : " + Integer.MIN_VALUE + "(-2,147,483,648)");
		System.out.println("Integer의 최대값 : " + Integer.MAX_VALUE + "(2,147,483,647)");

		System.out.println("Float의 최소값 : " + Float.MIN_VALUE);
		System.out.println("Float의 최대값 : " + Float.MAX_VALUE);

		System.out.println("Long의 최소값 : " + Long.MIN_VALUE + "(-9,223,372,036,854,775,808)");
		System.out.println("Long의 최대값 : " + Long.MAX_VALUE + "(9,223,372,036,854,775,807)");

		int x = 5;
		float pi = 3.14f;
		System.out.println("x=" + x + " and pi = " + pi);
		System.out.printf("x=%f and pi = %d\n", pi, x);
		System.out.printf("x=%d and pi = %f\n", x, pi);

	}

}
