package ex_p208_211;

public class _01 {

	public static void main(String[] args) {

		System.out.print(counChar("abcsdcc", 'c'));

	}

	static int counChar(String s, char c) {

		int m = 0;
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == c) {
				m++;
			}
		}
		return m;

	}
}
