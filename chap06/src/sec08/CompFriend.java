package sec08;

public class CompFriend {
	// 필드
	private String name;
	private String department;
	private String phone;

//생성자

	public CompFriend(String n, String d, String p) {
		this.name = n;
		this.department = d;
		this.phone = p;

	}

	// 메서드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
		System.out.println("번호 : " + phone);
	}
}
