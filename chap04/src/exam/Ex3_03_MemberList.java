package exam;

public class Ex3_03_MemberList {

	public static void main(String[] agrs) {

		// 이름, 아이디, 암호, 나이
		// 외부객체 접근자 설정자로만 접근
		// 생성자 생성

		Ex3_03_Member t = new Ex3_03_Member();
		Ex3_03_Member t1 = new Ex3_03_Member();

//		t.set("경원d", "qqqq1", "asd", 20);
//		t1.set("리우", "qqqq2", "iid", 30);
		System.out.println(t.getN());
		System.out.println(t.getId());

		t.setN("호랑이");
		t.setN("리우");

	}

}
