package ex_260_02;

public class Student extends Person {
//필드
	int num;

	// 매서드
	void show() {
		System.out.println("학생[이름 : " + name + ", 나이 : " + age + ", 학번 : " + num);
	}

	// 생성자
	public Student(String n, int m, int num) {
		super(n, m);
		this.num = num;
	}
}
