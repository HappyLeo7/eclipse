package sec10;

public class LocalClassDemo {
	private String s1 = "외부";

	void method() {// 매서드 안에 들어가면 지역변수 지역클래스
		int x = 1; // int 지역변수
		class LocalClass { // 지역클래스
			String s2 = "내부";
			String s3 = s1;

			public void show() {
				System.out.println("지역 클래스");
				// x=2; //지역변수는 final로 번역된다. 그래서 새로 선언 불가
			}
		}

		LocalClass lc = new LocalClass();
		System.out.println(lc.s2);
		lc.show();
	}

	public static void main(String[] args) {
		LocalClassDemo lcd = new LocalClassDemo();
		lcd.method();
	}
}
