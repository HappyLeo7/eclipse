package sec01;

public class ObjectMethpdDemo {
	public static void main(String[] args) {

		Mouse m1 = new Mouse("Logitech");
		System.out.println(m1.getClass());
		System.out.println(m1);
		System.out.println(m1.toString());

		Keyboard k1 = new Keyboard("Microsoft");
		System.out.println(k1.toString());
		System.out.println(k1);

		Mouse m2 = new Mouse("Logitech");
		System.out.println(m1.equals(m2)); // 주소가 다르다 False

		Mouse m3 = m1;
		System.out.println(m1.equals(m3));

		Keyboard k2 = new Keyboard("Microsoft");
		System.out.println(k1.equals(k2));

	}
}
