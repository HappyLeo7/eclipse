package exx02;

public class CastExceptionTest {
	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		try {
			casting(r);
		} catch (ClassCastException e) {
			System.out.println("예외");
			;
		}

	}

	static void casting(Shape s) throws ClassCastException{//throws를 넣어서 메인으로 던져줘야한다.
		Circle c = (Circle) s;
	}
}
