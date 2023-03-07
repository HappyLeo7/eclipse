package sec06;

public class _04Person {

	// 기본값 변수 변환 정의 "멤버""필드"
	String name;
	int age;

	// Class _04Person를 메소드화한다 (고정할 소스)
	_04Person setName(String n) {
		this.name = n;
		return this;
	}

	// Class _04Person를 메소드화한다 (고정할 소스)
	_04Person setAge(int a) {
		this.age = a;
		return this;
	}

	void sayHello() {
		System.out.println("안녕, 나는 " + name + "이고 " + age + "살이야");
	}
}
