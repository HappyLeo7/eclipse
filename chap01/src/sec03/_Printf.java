package sec03;

public class _Printf {

	public static void main(String[] args) {

		int i = 97;
		String s = "Java";
		double f = 3.141592f;

		System.out.printf("%%d\\n : %d\n", i); // 10진수
		System.out.printf("%o\n", i); // 8진수
		System.out.printf("%x\n", i); // 16진수
		System.out.printf("%c\n", i); // 문자
		System.out.printf("%5d\n", i); // 5자리,빈자리는 공백 처리한다.(전체 5자리 표시)
		System.out.printf("%05d\n", i); // 5자리,빈자리는 0으로 채운다. (전체 5자리 표시)

		System.out.printf("%s\n", s); // 문자열
		System.out.printf("%5s\n", s); // 5자리, 빈자리는 공백 처리한다.(전체 5자리 표시)
		System.out.printf("%-5s\n", s); // 5자리, 빈자리는 고백 처리한다. 왼쪽 정렬(전체 5자리 표시)

		System.out.printf("%f\n", f); // 10진수 실수
		System.out.printf("%e\n", f); // 지수
		System.out.printf("%4.2f\n", f); // 4자리, 소수점 이하 1자리 (전체 4자리, 소수점 1자리)
		System.out.printf("%04.1f\n", f); // 4자리, 소수점 이하 1자리, 빈자리 0으로 채운다.(전체 4자리, 소수점 1자리)
		System.out.printf("%-4.1f\n", f); // 4자리, 소수점 이하 1자리, 왼쪽 정렬(전체 4자리, 소수점 1자리)
		System.out.printf("%8.6f\n", f);

		/*
		 * char x1 = 76; char x2 = 111; char x3 = 118; char x4 = 101;
		 * 
		 * System.out.print(x1, x2, x3, x4);
		 * 
		 * 
		 * import java.util.Scanner; Scanner in=new Scanner(System.in) int x =
		 * in.nextint()
		 */
	}

}
