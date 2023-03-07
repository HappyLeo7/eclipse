package exx05;

public class StringTest {
	public static void main(String[] args) {

		show(new String("멘붕"));
		show(new StringBuilder("meltdown"));
		show(new StringBuffer("!@#"));
//		show(new Date());
	}

	private static void show(CharSequence s) {
		System.out.println(s);
	}
//	private static void show(Object s) {
//		System.out.println(s);
//	}

	//////////////////////////////////////////////////////////////////
//	private static void show(String s) {
//		System.out.println(s);
//	}
//
//	private static void show(StringBuilder s) {
//		System.out.println(s);
//	}
//
//	private static void show(StringBuffer s) {
//		System.out.println(s);
//	}
//
//	private static void show(Date s) {
//		System.out.println(s);
//	}

//	public static void show() {
//		System.out.println(n);
//		return n.hashCode();
//	}
}
