package sec01;

public class _ExBusinessMan extends _ExMan {// 자식
	String company;
	String position;

	public _ExBusinessMan(String name, String company, String position) {
		super(name);// 부모의 생성자를 호출하는 코드"슈퍼()" 자동적으로 잡아주지만 부모에 생성자가 생기면 연결을 해주어야한다.
		this.name = name;
		this.company = company;
		this.position = position;
	}

	public void tellYourInfo() {
		System.out.println("My company is " + company);
		System.out.println("My position is " + position);
		tellYourName();
	}

}
