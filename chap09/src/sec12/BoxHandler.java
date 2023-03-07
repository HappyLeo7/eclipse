package sec12;

public class BoxHandler {
	public static void outBox(Box5<Toy> box) {
		Toy t = box.get();
		System.out.println(t);
	}

	public static void outBox2(Box5<? extends Toy> box, Toy n) { // extends 를 넣으면 get만가능 set 불가하게 제약을줌
		Toy t = box.get();
		System.out.println(t);
//		box.set(new Toy());
	}

	// 오버라이딩이라고 생각하나 Box5 뒤에 컴파일러들은 지우기때문에 똑같은 취급받는다 하지만 ",Toy n" 과 ",Robot n "을 넣으면
	// 해결이된다.
	public static void outBox2(Box5<? extends Robot> box, Robot n) {

	}

	public static <T> void outBox3(Box5<? extends T> box) {
		T t = box.get();
		System.out.println(t);
	}

	public static void inBox(Box5<Toy> box, Toy n) {
		box.set(n);
//		Toy t=box.get();
	}

	public static void inBox2(Box5<? super Toy> box, Toy n) { // super set만가능
		box.set(n);
//		Toy t=box.get();
	}

	public static <T> void inBox3(Box5<? super T> box, T n) { // 다른 타입들도 다가능
		box.set(n);
	}

}
