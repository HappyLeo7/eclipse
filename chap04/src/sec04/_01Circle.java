package sec04;

public class _01Circle {

	double radius;

	_01Circle() {
	}

	_01Circle(double radius) {
		this.radius = radius;
	}

	void setRadius(double radius) {
		if (radius > 0) {
			this.radius = radius;
		} else {
			System.out.println("불가능");
		}
	}

	public double getRadius() {
		return this.radius;
	}

	double findArea() {
		return 3.14 * radius * radius;
	}

	void show(double x, double y) {
		System.out.printf("반지름=%.1f, 넓이= %.1f\n", x, y);
	}
}
