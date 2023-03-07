package Sec01;

public class While2Demo1 {

	public static void main(String[] args) {

		int x = 1;

		while (x < 10) {
//			System.out.printf("%d 단\n", x++);
//			System.out.println();
			int y = 2;
			while (y < 10) {

				System.out.printf("%d X %d = %d\t", y, x, x * y);
				y++;

			}

			System.out.println();
			++x;
		}

	}

}
