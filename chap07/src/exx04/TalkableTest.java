package exx04;

public class TalkableTest {
	static void speak(Korean korean) { // Korean 타입의 클래스
		System.out.println("안녕하세요!");
	}

	static void speak(American korean) { // American 타입의 클래스
		System.out.println("Hello!");
	}

	public static void main(String[] args) {
		speak(new Korean());
		speak(new American());
	}
}
