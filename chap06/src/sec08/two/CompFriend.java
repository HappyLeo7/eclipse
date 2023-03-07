package sec08.two;

public class CompFriend extends Friend {
	// 필드
//	private String name;
	private String department;
//	private String phone;

//생성자
	public CompFriend(String a, String d, String b) {
//		this.name = n;
		super(a, b);
//		System.out.println(n);
//		System.out.println(p);

		this.department = d;
//		this.phone = p;

	}

	// 메서드
//오버라이딩
	public void showInfo() {
		super.showInfo();
//		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
//		System.out.println("번호 : " + phone);
	}
}
