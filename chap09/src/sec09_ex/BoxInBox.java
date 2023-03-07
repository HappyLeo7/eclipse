package sec09_ex;

import sec05_T.BoxT;

public class BoxInBox {
	public static void main(String[] args) {
		BoxT<String> sBox = new BoxT<>();
		sBox.setOb("I am so happy.");

		BoxT<BoxT<String>> wBox = new BoxT<>();
		wBox.setOb(sBox);

		BoxT<BoxT<BoxT<String>>> zBox = new BoxT<>();
		zBox.setOb(wBox);

		System.out.println(zBox.getOb().getOb().getOb());

	}
}
