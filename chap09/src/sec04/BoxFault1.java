package sec04;

public class BoxFault1 {
	public static void main(String[] args) {
		Box aBox = new Box();
		Box oBox = new Box();

		aBox.setOb(new Apple());
		oBox.setOb(new Orange());

		Apple ap = (Apple) aBox.getOb();
		Orange og = (Orange) oBox.getOb();

		System.out.println(ap);
		System.out.println(og);

	}
}
