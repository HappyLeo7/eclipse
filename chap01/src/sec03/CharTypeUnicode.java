package sec03;

public class CharTypeUnicode {
	public static void main(String[] args) {
		char ch1 = '헐';
		char ch2 = '확';

		char ch3 = 54736; // 8진수
		char ch4 = 54869;

		char ch5 = 0xD5D0; // 16진수
		char ch6 = 0xD655;

		char c = '\u0041';
		char c1 = '\b';

		System.out.println(ch1 + " " + ch2);
		System.out.println(ch1 + ch2);
		System.out.println((int) ch1 + " " + (int) ch2);
		System.out.println(ch3 + " " + ch4);
		System.out.println(ch5 + " " + ch6);
		System.out.println((int) ch5 + " " + (int) ch6);
		System.out.println((short) ch5 + " " + (short) ch6);
//		System.out.println(ch7);
		System.out.println(c);
		System.out.println(c1);

	}

}
