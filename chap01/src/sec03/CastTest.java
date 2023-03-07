package sec03;

public class CastTest {

	public static void main(String[] args) {

		double d1 = 5 * 3.14; // 5 -> 5.0로 변경 double로 변경
		double d2 = 1; // 1 -> 1.0로 변경
		System.out.println(d1);
		System.out.println(d2);

		int num1 = 50;
		long num2 = 3147483647L;
		System.out.println(num1 + num2); // 50 -> 50L

		System.out.println(59L + 34.5); // 59L -> 59.0로 변경

		// float f1 = 3.14; -> 3.14가 double이므로
		// float f1 = (float)3.14;
		// float f1 = 3.14f;
		double f1 = 3.14;

		System.out.println(f1);

		// byte b1 = 300;
		// byte b1 = (byte) 300; // byte는 -127~126까지만 표시되기 때문에
		int b1 = 300;

		System.out.println("b1 : " + b1);

		// byte x1 = 3.14;
		// byte x1 = (byte) 3.14;
		double x1 = 3.14;

		System.out.println("x1 : " + x1);

		double d = 3.14f;

		System.out.println("d : " + d);

		double pi = 3.1415;
		// int wholeNumber = pi;
		// int wholeNumber = (int) pi;
		double wholeNumber = pi;

		System.out.println("wholeNumber : " + wholeNumber);

		long num11 = 3000000007L;
//		int num22 = (int) num11;
		long num22 = num11;

		System.out.println("num22 : " + num22);

		short num31 = 1;
		short num32 = 2;
//		short num33 = (num31 + num32); //num31,num32 int이기 때문에 오류
//		short num33 = (short) num31 + (short) num32; //오류
		short num33 = (short) (num31 + num32);
		System.out.println("num33 : " + num33);

	}

}
