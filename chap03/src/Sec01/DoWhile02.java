package Sec01;

public class DoWhile02 {

	public static void main(String[] args) {

		int x = 1;

		do

		{
			int y = 2;
			do {
				System.out.printf("%d X %d = %d\t", y, x, x * y);

				y++;
			} while (y < 10);
			{

				System.out.println();
				x++;
			}
		} while (x < 10);
	}

}
