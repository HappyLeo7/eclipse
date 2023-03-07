package sec01;

public class _01String3Demo {

	public static void main(String[] agrs) {
		String s1 = new String("Hi,");
		String s2 = new String(" Java");

		System.out.println("문자열 길이(s1) : " + s1.length()); // 문자열 길이 "Hi," 이므로 3개의 글자가 있어서 3이나옴
		System.out.println(s1.charAt(1)); // 1번째의 캐릭터를 찾는 의미로 순서가 0 1 2 3 4 이므로 1은 i를 의미한다

		s1 = s1.concat(s2); // concat 는 해당 문제를 더한다는 의미 s1이 기존 문자열이면 그뒤에 s2를 붙인다

		System.out.println(s1.concat(s2) + "!");
		System.out.println(s1.toLowerCase() + "!"); // 모두 소문자로 변환
		System.out.println(s1.substring(4, 8) + "!"); // 해당배열 사이의 문자열 0 1 2 3 4 ~ 8-1 까지

		String s3 = " ";
		System.out.println(s3.isEmpty());
		System.out.println(s3.isBlank());
		String s4 = "";
		System.out.println(s4.isEmpty());
		System.out.println(s4.isBlank());

		String s5 = "*-*";
		System.out.println(s5.repeat(10));

		System.out.println(s2.trim().indexOf("v"));

		int i = 7;

		System.out.println(7 + 1 + "Java" + 7 + 1);

		String a1 = "990925-1055123";
		String text = a1.replace('-', ' ');
		System.out.println(text);

		String a2 = "990925-1055123";
		System.out.println(a2.substring(0, 6) + " " + (a2.substring(7, 14)));

		String a3 = "990925-1055123";
		System.out.println(String.join(" ", a3.substring(0, 6), (a2.substring(7, 14))));
	}

}
