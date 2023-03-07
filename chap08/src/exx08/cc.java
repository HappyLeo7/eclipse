package exx08;

import java.util.Arrays;
import java.util.Scanner;

public class cc {
	public static void array(String[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();

		String[] arr = s.split(" ");
		int num = arr.length;

		Arrays.sort(arr);
		System.out.println("입력 : " + s);
		System.out.println("단어개수 : " + num);
		System.out.print("정렬된 토큰 :");
		array(arr);

	}

}
