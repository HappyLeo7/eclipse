package sec01;

public class _ExMan { // 부모
	String name;

//	_ExMan() {  //디폴트생성자
//	}

	_ExMan(String name) {
		this.name = name;
	}

	public void tellYourName() {
		System.out.println("My name is" + name);
	}
}
