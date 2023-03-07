package ex_260_01;

//자식 클래스
public class ColoredCircle extends Circle {

	// 필드
	private String color;
//	private int radius;

//매서드
	void show() {
		System.out.println("반지름이 " + radius + "인 " + color + " 원이다.");
	}

	// 생성자
	public ColoredCircle(int radius, String color) {
		super(radius);
		this.color = color;
	}

}
