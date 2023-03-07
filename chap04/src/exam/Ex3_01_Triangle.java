package exam;

public class Ex3_01_Triangle {

	// private 필드 외부로부터 은닉
	private double b;
	private double c;

	// 생산자
	public Ex3_01_Triangle(double b, double c) {
		this.b = b;
//		System.out.println("1번" + b);
		this.c = c;
//		System.out.println("2번" + c);
	}

//	// 접근자
//	public void getTriangle() {
//		System.out.println(1 + 1);
//
//	}
//
//	public double getTriangle1() {
//		System.out.println("3번" + b);
//		return c;
//	}

	// 생성자
//	public void setTriangle(double b) {
//		this.b = b;
//		System.out.println("4번" + x);
//		System.out.println("5번" + b);
//		this.c = y;
//		System.out.println("6번" + c);
//		System.out.println("7번" + y);
//	}

	// 접근자
//	double findArea() {
//		return b * c / 2;
//
//	}

	double isSameArea() {
		return b * c / 2;
	}

	public boolean isSameArea(Ex3_01_Triangle t) {
		return isSameArea() == t.isSameArea();

//		
//		if (t.isSameArea() == isSameArea()) {
//			return true;
//		} else {
//			return false;
//		}
	}

}

//}
