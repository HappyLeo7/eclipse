package exx03;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TokenPrintTest {
	public static void main(String[] args) {
		// 필드
		String s = "of the people,by the people, for the people";

		// 예외처리 try{}chtch(){}
		try {
			showTokens(s, ", ");
		} catch (NoSuchElementException e) {
			System.out.println("끝");
		}

	}

	private static void showTokens(String s, String string) {
		StringTokenizer st = new StringTokenizer(s, string);

		while (true) {
			System.out.println(st.nextToken());
		}
	}
}
