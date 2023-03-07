package ex_p208_211;

import java.util.Scanner;

public class _04 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String m = "";
//		String m = in.nextLine();
		do {
			System.out.print("URL을 입력하세요 : ");
			m = in.nextLine();
//			if (!m.equals("bye")) {
			if (m.endsWith("com")) {
//				System.out.println(m + "은" + "'" + m.substring(9, m.length()) + "'" + "으로 끝납니다.");
				System.out.println(m + "은" + "'com'" + "으로 끝납니다.");

			}
			if (m.contains("java")) {
				System.out.println(m + "은" + "'java'" + "를 포함힙니다.");

			} else {
			}
		} while (!m.equals("bye"));

		while (true) {
			System.out.print("URL을 입력하세요 : ");
			String s = in.nextLine();
			if (s.equals("bye"))
				break;
			if (s.endsWith("com")) {
//			System.out.println(m + "은" + "'" + m.substring(9, m.length()) + "'" + "으로 끝납니다.");
				System.out.println(m + "은" + "'com'" + "으로 끝납니다.");

			}
			if (s.contains("java")) {
				System.out.println(s + "은" + "'java'" + "를 포함힙니다.");

			}

		}

	}
}
