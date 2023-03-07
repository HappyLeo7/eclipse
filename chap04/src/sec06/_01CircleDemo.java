package sec06;

public class _01CircleDemo {
	public static void main(String[] args) {
		_01Circle c1 = new _01Circle(10.0, "빨강");
		System.out.println("반지름: " + c1.radius + "컬러: " + c1.color);

		_01Circle c2 = new _01Circle(5.0);

		_01Circle c3 = new _01Circle("노랑");

		_01Circle c4 = new _01Circle();

		_01Circle c5 = new _01Circle(2.5);

//		c1.color;
	}
}
