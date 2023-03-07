package sec03;

public class ReadAgeException extends Exception {

	// 생성자, 부모의 생성
	public ReadAgeException() {
		super("유효하지 않은 나이가 입력되었습니다.");

	}

}
