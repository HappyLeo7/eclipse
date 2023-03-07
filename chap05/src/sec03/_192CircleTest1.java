package sec03;

public class _192CircleTest1 {
	public static void main(String[] args) {

		_192Circle c1 = new _192Circle(10.0);
		_192Circle c2 = new _192Circle(10.0);

		zero(c1);
		System.out.println("원(c1)의 반지름 : " + c1.getRadius());

		zero(c2.getRadius());
		System.out.println("원(c2)의 반지름 : " + c2.getRadius());

	}

	public static void zero(_192Circle c) {
		System.out.println();
		c.setRadius(0.0);
	}

	public static void zero(double r) {
		System.out.println(r);
		r = 0.0;
	}
}
