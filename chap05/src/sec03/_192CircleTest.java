package sec03;

public class _192CircleTest {
	public static void main(String[] args) {

		_192Circle[] cc = new _192Circle[5];

		for (int i = 0; i < cc.length; i++) {
			cc[i] = new _192Circle(i + 1.0);
			System.out.printf("원의 넓이(반지름 : %.1f) = %.2f\n", cc[i].getRadius(), cc[i].findArea());
		}

//		클래스[] 변수 = new 클래스[];
//		
//		for (int i = 0 "i 초기값"; i<변수.length "i의 범위";i++ "i증가") {
//			변수[i] = new 클래스(i+1.0);
//			System.out.printf("반지름:%.1f,넓이:%.2f ",cc[i].getRadius,cc[i].findArea());
//		}

	}
}
