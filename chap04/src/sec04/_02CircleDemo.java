package sec04;

public class _02CircleDemo {

	public static void main(String[] args) {
		_01Circle myCircle = new _01Circle();

		myCircle.radius = 10.0;
		myCircle.show(myCircle.getRadius(), myCircle.findArea()); // Circle class에서 getRadius를 만들고 가져올수 있음
		myCircle.show(myCircle.radius, myCircle.findArea());
	}

}
