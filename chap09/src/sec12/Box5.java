package sec12;

public class Box5<T> { // Box5<T> 은 제네릴 클래스이다.
//필드
	private T o;

//set // this // void + 변수
	public void set(T o) {
		this.o = o;
	}

//get //return // 타입 + 변수
	public T get() {
		return o;
	}

	public String toString() {
		return o.toString();
	}

}
