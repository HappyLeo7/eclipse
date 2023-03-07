package sec03;

import java.util.Scanner;

public class _01PhoneDemo {

	public static void main(String[] args) {
		Scanner myPhone1 = new Scanner(System.in);// 입력1
		Scanner myPhone2 = new Scanner(System.in);// 입력2
//		String ss = myPhone1.nextLine();
//		int ss1 = myPhone2.nextInt();
		_02Phone myPhone = new _02Phone(); // _02Phone class 가져오기
		System.out.println("휴대폰 기종: ");
		myPhone.model = myPhone1.nextLine();
//		myPhone.model = "갤럭시 S8";
		System.out.println("금액 : ");
		myPhone.value = myPhone2.nextInt();
//		myPhone.value = 100;
		myPhone.print();
		System.out.println(myPhone);

		Scanner myPhone3 = new Scanner(System.in);
		Scanner myPhone4 = new Scanner(System.in);
		_02Phone yourPhone = new _02Phone();
		yourPhone.model = myPhone3.nextLine();
		yourPhone.value = myPhone4.nextInt();
		yourPhone.print();
//		System.out.println(yourPhone);
//		myPhone = yourPhone;
//		System.out.println(myPhone);
//		myPhone.print();

	}

}
