package ex_1;

import java.util.Scanner;

public class Ch_06 {

	public static void main(String[] args) {

		Scanner st = new Scanner(System.in);
		System.out.print("화씨온도(F) : ");
		double F = st.nextDouble();
		double C = 5.0 / 9.0 * (F - 32.0);

		System.out.printf("%f", C);

	}

}
