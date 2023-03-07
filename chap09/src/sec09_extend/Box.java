package sec09_extend;

public class Box<T extends Number> {
	// ob 필드 선언
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}

}
