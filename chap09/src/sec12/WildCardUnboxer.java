package sec12;

public class WildCardUnboxer {
	public static void main(String[] args) {
		Box5<String> box = new Box5<>(); // box 생성
		box.set("So simple String"); // set 으로 저장
		Unboxer.peekBox(box); // Unboxer는 클래스 이지만 new로 안부르는 이유는 static 으로 매서드를 만들어 두었기 때문이다.
//		Unboxer.peekBox3(box); // Number로 제한해두었기때문에 String 타입의 문자가 들어갈수 없다 
//		Unboxer.peekBox4(box);

		Box5<Integer> iBox = new Box5<>();
		iBox.set(5959);
		Unboxer.peekBox2(iBox);
		Unboxer.peekBox3(iBox);
		Unboxer.peekBox4(iBox);

		Box5<Double> dBox5 = new Box5<>();
		dBox5.set(123.456);
		Unboxer.peekBox2(dBox5);
		Unboxer.peekBox3(dBox5);
//		Unboxer.peekBox4(dBox5);

	}
}
