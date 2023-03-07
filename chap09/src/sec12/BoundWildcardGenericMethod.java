package sec12;

public class BoundWildcardGenericMethod {
	public static void main(String[] args) {
		Box5<Toy> tbox = new Box5<>();
		BoxHandler.inBox3(tbox, new Toy());
		BoxHandler.outBox3(tbox);

		Box5<Robot> rBox = new Box5<>();
		BoxHandler.inBox3(rBox, new Robot());
		BoxHandler.outBox3(rBox);
	}
}
