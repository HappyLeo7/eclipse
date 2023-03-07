package Sec01;

public class For2 {

	public static void main(String[] args) {

		int i = 1;
		int o = 2;
		for (i = 1; i < 10; i++) {

			for (o = 1; o < 10; o++) {
				System.out.printf("%dX%d=%d\t", i, o, i * o);

			}
			System.out.println();
		}

	}
}
