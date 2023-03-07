package Sec02;

public class Switch04 {

	public static void main(String[] args) {

		System.out.println(howMany(1) + "있다.");
		System.out.println(howMany(2) + "있다.");
		System.out.println(howMany(0) + "있다.");
	}

	static String howMany(int n) {
		return switch (n) {
		case 1 -> "1개";
		case 2 -> "두개";
		default -> "많이";
		};
	}
}
