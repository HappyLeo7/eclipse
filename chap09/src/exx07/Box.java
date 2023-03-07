package exx07;

public class Box<T> {

	// 필드
	T a;
	// set

	public void set(T a) {
		this.a = a;
	}

	public T get() {
		return a;
	}
}
