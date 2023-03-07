package Sec02;

public class Method02 {

	public static void main(String[] args) {
		printScire(99);
		printScire(120);
	}

	public static void printScire(int sc) {
		if (sc < 0 || sc > 100) {
			System.out.println("잘못된 점수 : " + sc);
			return;
		}
		System.out.println("점수 : " + sc);
	}

}
