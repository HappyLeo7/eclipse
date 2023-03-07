package sec09_extend;

public class BoxDemo {
	public static void main(String[] args) {
//	Box<Apple> bb=new Box<>(); // 만들수 없다
		Box<Number> bb = new Box<>(); // Box 생성시 Number가 나오지만
		Box<Integer> bbb = new Box<>(); // Interger 도 넣을수 있다.
		bbb.set(560);
		System.out.println(bbb.get());

		Box<Double> dd = new Box<>();
		dd.set(123.123);
		System.out.println(dd.get());

	}
}
