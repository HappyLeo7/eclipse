package sec08;

public class _241_IntstanceofDemo {
	public static void main(String[] args) {
		_240_Student s = new _240_Student();
		_240_Person p = new _240_Person();

		System.out.println(s instanceof _240_Person);
		System.out.println(s instanceof _240_Student);
		System.out.println(p instanceof _240_Student);
//System.out.println(s instanceof String); // String  타입과 관련이 없어서 오류남
		System.out.println(s instanceof Object);
		downcast(s);
	}

	static void downcast(_240_Person p) {
		if (p instanceof _240_Student) {
			_240_Student s = (_240_Student) p;
			System.out.println("ok, 하향타입 변환");
		}
	}
}
