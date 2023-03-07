package testHoSeong.p7;

public class Box<T> {// 제네릭타입으로 생성
	// T타입 a 생성
	T a;

	public void set(T t) {

		a = t;
	}

	public T get() {
		return a;
	}
}
