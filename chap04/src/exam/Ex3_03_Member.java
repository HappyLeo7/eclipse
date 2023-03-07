package exam;

public class Ex3_03_Member {

	// 이름, 아이디, 암호, 나이
	// 외부객체 접근자 설정자로만 접근
	// 생성자 생성

	private String n = "홍길동"; // 이름
	private String id = "d"; // 아이디
	private String p = "f"; // 암호
	private int a; // 나이

	// 생성자
	public Ex3_03_Member() {

	}

	// 접근자(필드에 값이 있어야함)
	public String getN() {
		return n;

	}

	public String getId() {
		return id;

	}

	public String getP() {
		return p;

	}

	// 설정자
	void setN(String n) {
		this.n = n;
		System.out.println(n);

	}

//	Void set1(String n, String id, String p, int a) {
//		System.out.println();
//	}

//		System.out.println("이름: " + n);
//		System.out.println("아이디: " + id);
//		System.out.println("암호: " + p);
//		System.out.println("나이: " + a);

// 설정자
}
