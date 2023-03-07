package exam;

public class Ex3_01_TriangleTest {
	public static void main(String[] args) {

//		Ex3_01_Triangle t = new Ex3_01_Triangle(10.0, 5.0); // new 지정
//		System.out.println(t.findArea());
//		t.setTriangle(10.0);

		Ex3_01_Triangle t1 = new Ex3_01_Triangle(10.0, 5.0); // 생성자
		Ex3_01_Triangle t2 = new Ex3_01_Triangle(5.0, 10.0);
		Ex3_01_Triangle t3 = new Ex3_01_Triangle(8.0, 8.0);
		Ex3_01_Triangle t4 = new Ex3_01_Triangle(8.0, 8.0);

		System.out.println("1번" + t1.isSameArea(t2));
		System.out.println("2번" + t1.isSameArea(t3));
		System.out.println("3번" + t1.isSameArea(t4));

	}
}
