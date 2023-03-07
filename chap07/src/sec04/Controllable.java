package sec04;

public interface Controllable {
//on off 매서드

	void turnOn();

	void turnOff();

	// 오바라이딩하는방법 default 붙여준다.
	default void repair() {
		show("장비를 수리한다.");
	}

	// 위의 매서드에 몸체가 생기려면 아래와 같이 몸체를 생성해야한다.
	private void show(String s) {
		System.out.println(s);

	}

	static void reset() {
		System.out.println("장비를 초기화한다.");
	}
}
