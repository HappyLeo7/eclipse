package sec11;

import sec04.Apple;

public class GenericMethodBoxMaker {
	public static void main(String[] args) {
		BoxFactory bf = new BoxFactory();
		Box<String> sBox = bf.makeBox("Sweet");
		System.out.println(sBox.get());

		Box<Double> dBox = bf.makeBox(7.56);
		System.out.println(sBox.get());

		Box<Apple> aBox = bf.makeBox(new Apple());
		System.out.println(sBox.get());
	}
}
