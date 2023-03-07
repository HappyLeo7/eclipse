package sec07;

public class _01Circl_Static_Dema {
	public static void main(String[] args) { // main 선언

		System.out.println("인스턴스 생성전 원의 개수 : " + _01Circl_Static.numOfCircles);
		_01Circl_Static myCircl = new _01Circl_Static(10.0); // new 정의
		System.out.println("myCircl 생성후원의 개수 : " + _01Circl_Static.numOfCircles);
		System.out.println(myCircl);
		_01Circl_Static yourCircl = new _01Circl_Static(5.0);

		// print();
		System.out.println("원의 개수 : " + _01Circl_Static.numOfCircles);
		System.out.println("원의 개수 : " + yourCircl.numCircles);

	}

	void print() {
		System.out.println("인스턴스 메서드 입니다.");
	}
}
