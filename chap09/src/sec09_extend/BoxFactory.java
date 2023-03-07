package sec09_extend;

public class BoxFactory {
	public static <T extends Number> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.set(o);

		System.out.println("Boxed data : " + o.intValue()); // p324 참조
		System.out.println("Boxed data : " + o.doubleValue()); // p324 참조
		return box;
	}
}
