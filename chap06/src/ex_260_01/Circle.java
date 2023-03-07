package ex_260_01;

//부모클래스
public class Circle {

//필드
	int radius;

	// 메서드
	void show() {
		System.out.println("반지름이 " + radius + "인" + " 원이다.");
	}

	// 생성자
	public Circle(int radius) {
		this.radius = radius;
	}
}
