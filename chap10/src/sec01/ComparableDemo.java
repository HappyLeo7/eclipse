package sec01;

import java.util.Arrays;

public class ComparableDemo {
	public static void main(String[] args) {
		Rectangle[] re = { new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(4, 7) };

		Arrays.sort(re);

		for (Rectangle r : re)
			System.out.println(r);
	}
}
