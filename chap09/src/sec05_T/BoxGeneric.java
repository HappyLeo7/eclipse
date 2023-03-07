package sec05_T;

import sec04.Apple;
import sec04.Orange;

public class BoxGeneric {
	public static void main(String[] args) {
		BoxT<Apple> aBox = new BoxT<>();
		BoxT<Orange> oBox = new BoxT<>();

		aBox.setOb(new Apple());
		oBox.setOb(new Orange());

//		aBox.setOb("Apple");  //오류차단 안정성이 올라감

		Apple ap = aBox.getOb();
		Orange og = oBox.getOb();

		System.out.println(ap);
		System.out.println(og);
	}
}
