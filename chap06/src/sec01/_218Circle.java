package sec01;

public class _218Circle {
	_218Circle() {
		System.out.println("caaa");
	}

	private void secret() { // private 접근지시자 (클래스 내부만 사용가능)
		System.out.println("비밀이다.");
	}

	protected void findRadius() {
		System.out.println("반지름이 10.0센티이다.");
	}

	public void findArea() {
		System.out.println("넓이는 (π*반지름*반지름)이다.");
	}
}
