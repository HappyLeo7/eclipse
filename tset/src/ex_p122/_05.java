package ex_p122;

public class _05 {

	public static void main(String[] args) {
		// a+b+c=20 이하인

		for (int a = 1; a < 21; a++) {
			for (int b = 1; b < 21; b++) {
				for (int c = 1; c < 21; c++) {
					if ((a * a) + (b * b) == (c * c) && a + b + c <= 20) {
						System.out.print("피타고라스 정리 :" + a + "," + b + "," + c);
					} else {
						System.out.println("\n");
						System.out.print("피타고라스 정의 불가 :" + a + "," + b + "," + c);
					}
				}
			}
		}
	}

}
