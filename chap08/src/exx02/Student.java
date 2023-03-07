package exx02;

public class Student {

	String name;

	Student(String i) {
		this.name = i;
	}

	@Override // 오버라이딩
	public String toString() {
		return "학생[" + name + "]";
	}

}
