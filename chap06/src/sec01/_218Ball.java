package sec01;

public class _218Ball extends _218Circle {

	private String color; // 현재 클래스만 사용가능하게 설정

	public _218Ball(String color) { // 생성자
		this.color = color;
	}

	public void findColor() {
		System.out.println(color + " 공이다.");
	}

//	@Override // 부모로부터 상속받은것을 내가 오버라이딩하는거야
//	public void findArea(int r) {
//		System.out.println("넓이는 4*(π*반지름*반지름)이다.");
//	}
	@Override
	public void findArea() {
		super.findArea();
//		secret();  //private이므로 자식 클래스에 호출불가
		System.out.println("넓이는 4*(π*반지름*반지름)이다.");
	}

//	@Override
//	public void getArea() { //부모에게 getArea이 없어서 에러
//		
//	}

	public void findVolime() {
		System.out.println("부피는 4/3* (π*반지름*반지름)이다.");
	}

}
