package sec01;

public class _01String5Demo {

	public static void main(String[] agrs) {
		String version = String.format("%s %d", "jdk", 14);
		System.out.println(version);

		String fruits = String.join("/", "apple", "banana", "cjerry", "durian"); // 처음 들어간 문자를 사이사이 반복해줌
		System.out.println(fruits);

		boolean sw = true;
		boolean sw1 = false;
		String pi = String.valueOf(3.14);
		String pi1 = String.valueOf(3);
		String pi2 = String.valueOf("d");
		String pi3 = String.valueOf(sw);
		String pi4 = String.valueOf(sw1);
		System.out.println(pi);
		System.out.println(pi1);
		System.out.println(pi2);
		System.out.println(pi3);
		System.out.println(pi4);

	}
}
