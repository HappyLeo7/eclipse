package sec01;

public class _233Mammal extends _233Animal {// 자식
	public _233Mammal() {
		super("원숭이");// 부모의 생성자
		System.out.println("포유류 : 원숭이");
	}

	public _233Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);

	}

	public _233Mammal(String a, String b, String c) {
		super(a + b + c);

		System.out.println("음식 : " + a + b + c);
	}
}
