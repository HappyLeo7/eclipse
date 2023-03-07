package ex_p208_211;

import java.util.Scanner;

public class _05_1 {

	public static void main(String[] args) {
		String[][] num = new String[10][10];
		String[][] overlap = new String[10][10];
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 10개 입력하세요.");
		for (int a = 0; a < 10; a++) { // 10번 반복해서 input 값을 10개 받아줌
			int input = sc.nextInt();
			if (input >= 0 && input <= 99) { // 0부터 99까지의 값을 받아줌
				if (num[input / 10][input % 10] == "*")
					overlap[input / 10][a] = "*"; // 중복일 때 중복 배열에 추가해줌
				num[input / 10][input % 10] = "*"; // 받은 값을 10으로 나눈값 행위치 나머치를 열위치에 *문자열을 저장
			}
		}
		for (int a = 0; a < 10; a++) {
			System.out.printf("%2d ~ %2d : ", a * 10, a * 10 + 9);
			for (int b = 0; b < 10; b++) {
				{
					if (num[a][b] != null) // null 값이 아니면 * 출력
						System.out.print(num[a][b]);
					if (overlap[a][b] != null)
						System.out.print(overlap[a][b]);
				}
			}
			System.out.println();
		}

	}

}
