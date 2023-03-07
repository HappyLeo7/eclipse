package testHoSeong.p4;

public class Pair<T> { // 제네릭타입으로 하여 여러 타입이 들어올수 있게 함

	private T num1;
	private T num2;

	// 생성자
	public Pair(T num1, T num2) {
		this.num1 = num1;
		this.num2 = num2;

	}

	// 첫번째에 있는값이니 num1 리턴
	public T first() {

		return num1;

	}

	// 두번째에 있는 값이니 num2 리턴
	public T secound() {

		return num2;
	}
}
