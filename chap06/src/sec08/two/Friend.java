package sec08.two;

public class Friend {

	private String name;
	private String phone;
//	private String department;
//	private String major;

	public Friend() {
	}

	public Friend(String n, String p) {
		this.name = n;
		this.phone = p;
//		System.out.println("이름 : " + name);
//		System.out.println("부서 : " + department);
//		System.out.println("번호 : " + phone);

	}
//	public Friend1(String n, String m, String p) {
//		this.name = n;
//		this.major = m;
//		this.phone = p;
//		
//	}

	//
//	public void showInfo() {
//		System.out.println("이름 : " + name);
//		System.out.println("부서 : " + department);
//		System.out.println("번호 : " + phone);
//	}
	public void showInfo() {
		System.out.println("이름 : " + name);
//		System.out.println("전공 : " + major);
		System.out.println("번호 : " + phone);
	}

}
