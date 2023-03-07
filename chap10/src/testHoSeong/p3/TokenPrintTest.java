package testHoSeong.p3;

import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class TokenPrintTest {

	public static void main(String[] args) {
		// 변수 생성
		String s = "of the people, by the people, for the people";
		try {
			showTokens(s, ", "); // NoSuchElementException 발생(이미 토큰이 다 떨어짐
		} catch (NoSuchElementException e) {
			System.out.println("끝"); // NoSuchElementException발생 했으면 끝을 출력하고 끝냄
		}

	}

	// String값 두개를 받아 s는 문자열을 나누고 2번째는 나누는 기준으로 생성(StringTokenizer)
	static void showTokens(String s, String string) {
		StringTokenizer st = new StringTokenizer(s, string);
		while (true) { // while문이 true로 무한으로 돌아가는데 토큰이 떨어지면 더이상 안돌아가서 NoSuchElementException이뜸
			System.out.println(st.nextToken());
		}
	}

}
