package exx04;

public class Pair<T> {
//필드 2개 int 타입

	T a;
	T b;

	// 메서드2개 각각 하나의 필드 값을 반환한다.
	//생성자
	Pair(T a, T b) {

		this.a = a;
		this.b = b;
	}

	T first() {
		return a;
	}

	T second() {
		return b;

	}

}
