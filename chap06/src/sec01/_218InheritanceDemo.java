package sec01;

public class _218InheritanceDemo {

	public static void main(String[] args) {
		_218Circle c_218Circle = new _218Circle();
		_218Ball c_218Ball = new _218Ball("빨간색");

		System.out.println("원");
		c_218Circle.findRadius();
		c_218Circle.findArea();

		System.out.println("\n공 :");
		c_218Ball.findRadius();
		c_218Ball.findColor();
		c_218Ball.findArea();
		c_218Ball.findVolime();

	}
}
