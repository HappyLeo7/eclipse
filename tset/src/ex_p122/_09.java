package ex_p122;

public class _09 {

	public static void main(String[] args) {
		foo("안녕", 1);
		foo("안녕하세요", 1, 2);
		foo("잘 있어");
	}

	static void foo(String n, int n1) {
		System.out.println(n + n1);
	}

	static void foo(String n, int n1, int n2) {
		System.out.println(n + n1 + n2);
	}

	static void foo(String n) {
		System.out.println(n);
	}

}
