package sec06;

public class _01Circle {

	double radius;
	String color;

	public _01Circle(double r, String c) {
//		this(r,c); //오류남
		radius = r; // 변수 고정값들
		color = c;// 변수 고정값들
		System.out.println("1. 반지름 : " + radius + "\n컬러 : " + color);
	}

	public _01Circle(double r) {
		this(r, "파랑"); // 위에있는 public _01Circle(double r, String c)를 가져온다
//		radius = r;// 변수 고정값들
//		color = "파랑";// 고정값들
		System.out.println("2. 반지름 : " + radius + "\n컬러 : " + color);

	}

	public _01Circle(String c) {
		this(10.0, c);
//		radius = 10.0;// 고정값들
//		color = c;// 변수 고정값들
		System.out.println("3. 반지름 : " + radius + "\n컬러 : " + color);

	}

	public _01Circle() {
		this(10.0, "빨강");
//		radius = 10.0;// 고정값들
//		color = "빨강";// 고정값들
		System.out.println("4. 반지름 : " + radius + "\n컬러 : " + color);
	}

}
