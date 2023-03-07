package sec07_333;

import java.util.Random;

public class RandomDemo {

	public static void main(String[] args) {
		Random r = new Random();
		for (int i = 0; i < 5; i++) {
			System.out.print(r.nextInt(100) + " ");
		}
		System.out.println();
		Random r2 = new Random(10);
		for (int i1 = 0; i1 < 5; i1++) {
			System.out.print(r2.nextInt(100) + " ");
		}
		System.out.println();

		Random r3 = new Random(System.currentTimeMillis());
		System.out.println(r3.nextInt(100) + " ");

	}
}
