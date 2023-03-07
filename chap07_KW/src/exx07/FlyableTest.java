package exx07;

public interface FlyableTest {
	public static void main(String[] args) {
		Flyable f = new Flyable() {

			// 익명 지역 클래서는 매서드 안에 들어가야한다.

			public void speed() {
				System.out.println("속도");
			}

			public void height() {
				System.out.println("높이");
			}

		};
		f.speed();
		f.height();
	}
}
