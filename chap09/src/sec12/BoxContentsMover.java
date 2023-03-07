package sec12;

public class BoxContentsMover {
	public static void moveBox(Box5<? super Toy> to, Box5<? extends Toy> from) {
		to.set(from.get());
	}
}
