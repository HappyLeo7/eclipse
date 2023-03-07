package testHoSeong.p2;

public class CastExceptionTest {

	public static void main(String[] args) {
		// Rectangle 타입 r생성
		Rectangle r = new Rectangle();
		try {
			casting(r);
		} catch (ClassCastException e) { // ClassCastException시 아무것도 안뜨게 생성
		}
	}

	static void casting(Shape s) throws ClassCastException {
		Circle c = (Circle) s; // ClassCastException 오류가 발생 (Circle과 Rectangle과는 관계가 없기때문
	}
}
