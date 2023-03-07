package sec08.two;

public class UnivFriend extends Friend {
//이름,전공,전화번호
	// 필드
//	private String name;
	private String major;
//	private String phone;

	//
//	public UnivFriend() {
//	}
	// 생성자
	public UnivFriend(String n, String m, String p) {
		super(n, p);
//		this.name = n;
		this.major = m;
//		this.phone = p;
	}

	public void showInfo() {
		super.showInfo();
//		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
//		System.out.println("번호 : " + phone);
	}

}
