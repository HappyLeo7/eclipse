package ex03;

import java.util.Arrays;

public class BookTest extends Book {
	public static void main(String[] args) {

		int[] books = { 15000, 50000, 20000 };
		Arrays.sort(books);
		System.out.println(books); // 주소값
	}
}
