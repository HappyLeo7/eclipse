package sec09_extend;

public class BoundGenericMethod {
	public static void main(String[] args) {
		Box<Integer> sbox = BoxFactory.makeBox(5959);
		Integer n = sbox.get();
		System.out.println(n);

		Box<Double> dbox = BoxFactory.makeBox(6464.4444);
		double d = dbox.get();
		System.out.println(d);
	}
}
