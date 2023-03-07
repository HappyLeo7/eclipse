package sec03;

public class Boolean {

	public static void main(String[] args) {

		boolean b1 = true;
		boolean b2 = false;

		System.out.print("b1=true ");
		System.out.println("결과 : " + b1);
		System.out.print("b2=false ");
		System.out.println("결과 : " + b2);
		System.out.println(b1 + "가 아니면" + b2 + "입니다");

		int num1 = 10;
		int num2 = 20;

		System.out.println(num1 < num2); // true 10 < 20 참
		System.out.println(num1 > num2); // false 10 > 20 거짓
		System.out.println(num1 == num2); // false 10 == 20 거짓
		System.out.println(num1 != num2); // true 10 != 20 참 " != " 는 서로 다르다라는 표시

		// var는 int string 으로 넣지 않고도 추론하여서 식별자로 사용가능
		// 메소드 내부에서만 사용 가능
		var num = 1000000.1;
		var k = "한국";

		System.out.println(num + num);
		System.out.println(k);
	}

}
