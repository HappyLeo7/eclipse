package sec01;

import java.util.StringTokenizer;

public class UnChecke1Demo {
	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);

		while (st.hasMoreTokens()) {
			System.out.print(st.nextToken() + "+");
		}
//		System.out.println(st.nextToken());    //컴파일러가 해결하지 못하는 오류
	}
}
