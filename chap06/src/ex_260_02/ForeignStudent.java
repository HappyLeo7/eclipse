package ex_260_02;

public class ForeignStudent extends Student {

	// 필드
	String nationality;

	// 매서드
	void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + num + ", 국적 : " + nationality);
	}

	// 생성자
	public ForeignStudent(String n, int m, int s, String f) {
		super(n, m, s);
		this.nationality = f;

	}
}
