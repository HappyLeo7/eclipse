package sec12;

public class MoveBoxContents {
	public static void main(String[] args) {
		Box5<Toy> box1 = new Box5<>();
		box1.set(new Toy());

		Box5<Toy> box2 = new Box5<>();
		BoxContentsMover.moveBox(box2, box1);
		System.out.println(box2.get());
	}
}
