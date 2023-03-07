package sec03;

import java.util.Scanner;

public class MyExceptiionClass {

	public static void main(String[] args) {
		System.out.println("나이 입력 : ");
//		int age = readAge();

		////////////////////
		int age;
		try {
			age = readAge();
			System.out.println("입력된 나이는 : " + age);
		} catch (ReadAgeException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		//////////////////////

//		System.out.println("입력된 나이는 : " + age);
	}

	// int 값을 리턴
	public static int readAge() throws ReadAgeException { // throws 는 떠넘기기
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();

		if (age < 0 || age > 150)
			throw new ReadAgeException(); // throw 일부로 에러 발생
		return age;
	}
}
