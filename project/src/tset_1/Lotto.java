package tset_1;

public class Lotto {

	public static void main(String[] args) {

		int lotto1 = 0;
		int lotto2 = 0;
		int lotto3 = 0;
		int lotto4 = 0;
		int lotto5 = 0;
		int lotto6 = 0;

		while (true) {
			int n = (int) (Math.random() * 45) + 1; // Math.random는 0~1사이의 랜덤 실수

			if ((lotto1 == 0) && (lotto1 != n)) {
				lotto1 = n;
			} else if ((lotto1 != n) && (lotto2 == 0) && (lotto2 != n)) {
				lotto2 = n;
			} else if ((lotto3 == 0) && (lotto3 != n) && (lotto2 != n) && (lotto1 != n)) {
				lotto3 = n;
			} else if ((lotto4 == 0) && (lotto4 != n) && (lotto3 != n) && (lotto2 != n) && (lotto1 != n)) {
				lotto4 = n;
			} else if ((lotto5 == 0) && (lotto5 != n) && (lotto4 != n) && (lotto3 != n) && (lotto2 != n)
					&& (lotto1 != n)) {
				lotto5 = n;
			} else if ((lotto6 == 0) && (lotto6 != n) && (lotto5 != n) && (lotto4 != n) && (lotto3 != n)
					&& (lotto2 != n) && (lotto1 != n)) {
				lotto6 = n;
			}
			if (lotto1 > 0 && lotto2 > 0 && lotto3 > 0 && lotto4 > 0 && lotto5 > 0 && lotto6 > 0) {
				break;
			}

		}
		System.out.printf("로또 번호 : %d,%d,%d,%d,%d,%d", lotto1, lotto2, lotto3, lotto4, lotto5, lotto6);

	}

}
