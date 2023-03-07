package exam;

public class Ex1_03_Pronter1 {

	private int numOfPapers;
	private boolean duplex;

	public Ex1_03_Pronter1(int numOfPapers, boolean duplex) {
		// this로 정의해주고 아래 print에서 사용가능
// 		System.out.println(numOfPapers);
		this.numOfPapers = numOfPapers;
//		System.out.println(duplex);
		this.duplex = duplex;
	}

	public void print(int amount) {
		// numOfPapers = 20(기본)
//amount = 출력용지		
		// 양면 2p
		// 단면 1p
		// numOfPapers = 용지수량
		// amount = 요청 페이지
		if (duplex == true && numOfPapers * 2 > amount && !(amount == 0)) { // num=20*2=40 , amount=25
			System.out.print("1.앙면으로");
			System.out.println(numOfPapers + "장 출력가능합니다.");
			System.out.print((amount / 2 + 1) + "장 출력했습니다.");
			numOfPapers = numOfPapers - (amount / 2 + 1); // num = 7
			System.out.println("현재" + numOfPapers + "장 남아 있습니다.");
			System.out.println("\n");

//			System.out.println(numOfPapers);
		}
		// numOfPapers 남은 수량
		else if (duplex == true && numOfPapers * 2 - amount < 0 && !(amount == 0)) {

			System.out.println("2.양면출력");
			System.out.println("출력가능" + numOfPapers);
			System.out.println("요청페이지" + (amount / 2 + 1));
			System.out.println("출력" + numOfPapers);
			System.out.println("부족한 용지" + ((numOfPapers) - (amount / 2 + 1)) * -1);
			numOfPapers = 0;
			System.out.println("\n");
		} else if (duplex == false && numOfPapers * 2 > amount && !(amount == 0)) {
			System.out.print("1.단면으로 모두 출력하려면 용지가");
//			System.out.println("1.출력가능" + numOfPapers);
//			System.out.println("2.요청페이지" + amount);
			System.out.print("용지가 " + (amount - numOfPapers) + "매 부족합니다.");
			System.out.println(numOfPapers + "장만 출력합니다.");
			numOfPapers = 0;
			System.out.println("\n");
		} else if (duplex == false && numOfPapers * 2 - amount < 0 && !(amount == 0)) {

			System.out.println("2.단면출력");
			System.out.println("출력가능" + numOfPapers);
			System.out.println("요청페이지" + amount);
			System.out.println("출력" + numOfPapers);
			System.out.println("부족한 용지" + ((amount - numOfPapers)));
			numOfPapers = 0;
			System.out.println("\n");
		}
	}

	public boolean getDuplex() {
		return duplex;
	}

	public void setDuplex(boolean duplex) {
		this.duplex = duplex;

	}

	void soo() {

	}

}
