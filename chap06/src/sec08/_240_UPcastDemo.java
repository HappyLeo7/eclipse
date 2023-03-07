package sec08;

public class _240_UPcastDemo {
	public static void main(String[] args) {
		_240_Person p;
		_240_Student s = new _240_Student();
		p = s; // 자동 형변환 이루어짐 p=(Person)s;
		// p. 은 2개 타입밖에없다 person은 부모타입으로 2가지 밖에 안가지고있음
		// s. 은 4개 타입가지고 올수 있음 Student는 자식 클래스로 본인 2개와 부모 2개를 가지고 올수 있기 때문이다.
	}
}
