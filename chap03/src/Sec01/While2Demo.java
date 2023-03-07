package Sec01;

public class While2Demo {

	public static void main(String[] args) {

		int x = 2;

		while (x < 10) {
			System.out.printf("%d단 : ", x);

			int y = 1;
			while (y < 10) {

				System.out.printf("%d X %d = %d\t", x, y, x * y);
				y++;

			}

			System.out.println();
			++x;
		}
	}

}
