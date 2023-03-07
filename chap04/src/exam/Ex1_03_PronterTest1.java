package exam;

public class Ex1_03_PronterTest1 {
	public static void main(String[] args) {
		Ex1_03_Pronter1 p = new Ex1_03_Pronter1(20, true);
		p.print(25);

		p.setDuplex(false);

		p.print(10);
//		p.print(5);

	}
}
