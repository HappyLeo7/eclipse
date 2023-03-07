package chap10HoSeong.p2;

public class WordableTest {

	public static void main(String[] args) {

		// 람다식으로 배열에 넣은 후 출력
		Wordable[] m = { () -> System.out.println("가위"), () -> System.out.println("나비"), () -> System.out.println("다리"),
				() -> System.out.println("마차") };

		for (int i = 0; i < m.length; i++) {
			m[i].word();
		}
	}

}
