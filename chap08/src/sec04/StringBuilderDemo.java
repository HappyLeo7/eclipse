package sec04;

public class StringBuilderDemo {
	public static void main(String[] args) {
		String s = new String("hi");
		System.out.println(s.hashCode());
		s = s + "!";
		System.out.println(s.hashCode());

		StringBuilder sb0 = new StringBuilder();

		System.out.println("sb0.legth: " + sb0.length()); //
		System.out.println("sb0.capacity() : " + sb0.capacity());

		StringBuilder sb = new StringBuilder("hi");
		System.out.println("sb.legth: " + sb.length()); //
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println(sb.hashCode());
		sb = sb.append("!");
		System.out.println(sb.hashCode());

		System.out.println(sb.replace(0, 2, "Good bye").insert(0, "java, "));
		// replace 0과 2 사이를 Good bye 로 바꿔줌
		// insert 0번째에서 삽입
		System.out.println("sb.legth: " + sb.length()); //
		System.out.println("sb.capacity() : " + sb.capacity());
		System.out.println("sb.hashCode() : " + sb.hashCode());
	}
}
