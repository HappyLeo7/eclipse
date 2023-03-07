package Ex_;

public class Xx_1 {
	public static void main(String[] args) {

//		int[] ss = { 1, 2, 3, 4 };
//		int[] s1 = new int[] { 1, 2, 3, 4 };
//
////		int s2;
////		s2=new int[]{1,2,3,4};
//
////		Ball[] balls =new Ball[5]

//		String str = "3";
//		System.out.println(str.charAt(0) - '0'); // 문자 3을 숫자 3으로 바꾸는 방법
//		System.out.println(Integer.parseInt("3") + 5);
//		System.out.println(3 + '0'); // 문자0은 48숫자를 갖는다

		String s = "abcde";
		String s1 = "ab";
		String s2 = "abm";
		Integer s3 = 77;
		Integer s4 = 411;
		Integer s5[] = new Integer[] { 411, 1, 2, 3, 4, 5 };
		Integer s6[] = new Integer[] { 411, 1, 2, 3, 4, 5 };

		System.out.println(s.compareTo(s1)); // abcde 와 ab 비교 ab는 같기때문에 자리값으로 변환 5와 2를 비교한다 값은 "3"
		System.out.println(s.compareTo(s2)); // abcde 와 abm을 비교할때 ab는 같으나 3번째 자리에서 c와m을 비교하기때문에 아스키값으로 변경된후 비교하여서
												// 값은"-10"
		System.out.println("77vs411 : " + s3.compareTo(s4) + " 비교값 작다"); // 숫자를 비교할때는 같으면 0 작은경우 -1 큰경우 1
		System.out.println("411vs77 : " + s4.compareTo(s3) + " 비교값 크다"); // 숫자를 비교할때는 같으면 0 작은경우 -1 큰경우 1
		System.out.println("77vs77 : " + s3.compareTo(s3) + " 같다"); // 숫자를 비교할때는 같으면 0 작은경우 -1 큰경우 1
//		System.out.println(s5[]);

	}
}
