package testHoSeong.p1;

public class NullpointerExceptionTest {

	public static void main(String[] args) {
		// d의 값이 null일 경우 MyDate를 새로 생성해서 삽입하게끔 함.
		try {
			MyDate d = null;
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		} catch (NullPointerException e) {
			MyDate d = new MyDate();
			System.out.printf("%d년 %d월 %d일\n", d.year, d.month, d.day);
		}
		;

	}

}
