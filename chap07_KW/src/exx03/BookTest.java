package exx03;

import java.util.Arrays;

public class BookTest {
	public static void main(String[] args) {
		Book[] b = { new Book(15000), new Book(50000), new Book(20000) };
		int[] book = new int[3];

		System.out.println("정렬 전");
		for (Book bo : b) {
			bo.show();
		}
		Arrays.sort(book);
		System.out.println("정렬 후");
		for (int i = 0; i < book.length; i++) {

			b[i] = new Book(book[i]);
			b[i].show();
		}
	}
}
