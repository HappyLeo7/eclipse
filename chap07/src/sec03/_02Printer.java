package sec03;

public class _02Printer implements _01Printable {// implements 를 이용하여 추상인터페이스를 가져온다

	@Override
	public void print(String doc) {
		System.out.println(doc);
	}

}
