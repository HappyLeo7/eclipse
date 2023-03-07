package sec07_332;

import java.util.StringTokenizer;

public class StringTokenizerDemo {
	public static void main(String[] args) {
		String s = "of the people,by the people,for the people";
		StringTokenizer st = new StringTokenizer(s, " ,");
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.print("[" + st.nextToken() + "]");

			// 문자열 과 구분자르 주면 나눠진 문자열의 갯수와 내용을 출력하는 메소드
			String a = "of the people,by the people,for the people";
			tokenizer(s, " ,");
			s = "PM:08:45";
			tokenizer(s, " :");
			s = "12+36-5/2=44";
			tokenizer(s, "+-/=");

		}

	}

	private static void tokenizer(String s, String b) {
		StringTokenizer st = new StringTokenizer(s, b);
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.print("[" + st.nextToken() + "]");
		}
		System.out.println();

	}
}
