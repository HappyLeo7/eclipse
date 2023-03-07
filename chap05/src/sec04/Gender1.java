package sec04;

public enum Gender1 {
	// 데이터
	MALE("남성"), FEMALE("여성");

	private String s;

	Gender1(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}
}
