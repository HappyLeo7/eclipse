package exx01;

public class Circle {
//필드
	int r;

	// 생성자
	Circle(int r) {
		this.r = r;
	}

	// 매서드
	public boolean equals(Object i) {
		if (i instanceof Circle) {
			Circle c = (Circle) i;
			if (r == c.r) {
				return true;
			}
		}
		return false;

	}
//void
}
