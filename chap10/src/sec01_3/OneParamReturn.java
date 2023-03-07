package sec01_3;

public class OneParamReturn {
	public static void main(String[] args) {
		Printable2 p;
		p = new Printable2() {

			@Override
			public void print(String s) {
				System.out.println(s);
			}
		};
		p = (String s) -> {
			System.out.println(s);
		}; // p = (매개변수) -> 몸체
		p = (String s) -> System.out.println(s);
		p = s -> System.out.println(s);

		p.print("즐거운 금요일!");
	}

}
