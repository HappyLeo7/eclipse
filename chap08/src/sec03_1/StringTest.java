package sec03_1;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("hello");// String이 클래스가 아니기 때문에 주소값이 나온다
		String str2 = new String("hello");

		System.out.println(str1 == str2);
		System.out.println("str1: " + str1.hashCode()); // hashCode는 오버라이딩을하여서 값이 같다
		System.out.println("str2: " + str2.hashCode());

		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		String str3 = "hello"; // String이 클래스 이기때문에 결과값이 나온다.
		String str4 = "hello";
		System.out.println(str3 == str4);

		String str5 = new String("world");

		str1 = str1.concat(str5);
		System.out.println(str1);
		System.out.println(System.identityHashCode(str1));
	}
}
