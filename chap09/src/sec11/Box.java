package sec11;

public class Box<T> {
	// ob 필드 선언
	private T ob;

	public void set(T o) {
		ob = o;
	}

	public T get() {
		return ob;
	}

}
