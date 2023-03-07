package sec04;

public class BoxFault2 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();

		aBox.setOb("Apple");
		oBox.setOb("Orange");

		Apple ap = (Apple) aBox.getOb();
		Orange og = (Orange) oBox.getOb();

		System.out.println(ap);
		System.out.println(og);
	}
}
