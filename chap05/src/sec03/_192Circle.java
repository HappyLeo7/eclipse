package sec03;

public class _192Circle {
	// 필드
//	public int[] radius= new int[5];

//	private 
	private double radius = 0;

	public _192Circle(double r) {
		this.radius = r;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	double findArea() {

		return 3.14 * radius * radius;

	}

}
