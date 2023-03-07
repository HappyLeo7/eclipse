package sec01;

public class _ExBusinessManDemo {
	public static void main(String[] args) {

		_ExMan c1 = new _ExMan("리우");
		_ExBusinessMan c2 = new _ExBusinessMan("이름", "(주)", "과장");
		c2.tellYourInfo();
		c1.tellYourName();

	}
}
