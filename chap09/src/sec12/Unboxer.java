package sec12;

public class Unboxer {

	public static <T> T openBox(Box5<T> box) {
		return box.get();
	}

	// 매서드 void
	public static <T> void peekBox(Box5<T> box) {// <T> 제너럴 매서드
		System.out.println(box);
	}

	// 와일드 카드 매서드
	public static void peekBox2(Box5<?> box) { // <?> 는 와일드 카드 표시 , 제너럴 매서드아니다
		System.out.println(box);
	}

	public static void peekBox3(Box5<? extends Number> box) { // extends을 사용하여 상한 제한
		System.out.println(box);

	}

	public static void peekBox4(Box5<? super Integer> box) { // super를 사용 하여 하한 제한
		System.out.println(box);
	}

}
