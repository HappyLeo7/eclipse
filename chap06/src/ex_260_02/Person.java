package ex_260_02;

//부모클래스
public class Person {
//필드
	String name;
	int age;

	// 메서드
	void show() {
		System.out.println("사람[이름 : " + name + ", 나이 : " + age);
	}

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}
