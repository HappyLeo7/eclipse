package exam;

public class Ex1_03_Printer {

	// 필드
	private int numOfPapers = 0; // 남은 용지

	public int getNumOfPapers() {
		return numOfPapers;
	}

	public void setNumOfPapers(int n) {
		this.numOfPapers = n;
	}

	void show(int x) {
		System.out.println("용지" + x + "장 추가되었습니다.");
		System.out.println("용지" + x + "장 남았습니다.");
	}

	// 메서드
	public void print(int amount) { // 출력 용지 amount=b
//		this.numOfPapers -= amount;
//		if (numOfPapers >= 0) {
		if (numOfPapers < 0) {
			System.out.println("용지가 없습니다.");

		} else if (numOfPapers > 0) {
			numOfPapers -= amount;
			if (numOfPapers > 0) {
				System.out.printf("용지 %d장 출력되었습니다.\n", amount);
			}
		}
		if (numOfPapers < 0) {
//			System.out.printf("용지가 부족합니다.\n\n", numOfPapers);
			System.out.println(-numOfPapers + "장 부족합니다.\n" + (amount + numOfPapers) + "장만 출력합니다.\n용지가 없습니다.");
		} else {
			System.out.printf("용지 %d남았습니다.\n\n", numOfPapers);
		}

	}

	public void print1(int m) {
		numOfPapers -= m;
	}
}
