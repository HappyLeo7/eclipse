package sec04;

public class _196ContantDemo {
	public static void main(String[] args) {

//		Scanner in = new Scanner(System.in);
//		int ss = in.nextInt();
		final int M = 0;
		final int F = 1;
		final int S = 1;
		int gender = F;

		if (gender == M) {
			System.out.println(M + "은(는) 병역 의무가 있다.");
		} else {
			System.out.println(F + "은(는) 병역 의무가 없다.");
		}
		if (gender == S) {
			System.out.println(S + "은(는) 누구?");
			gender = 5;
		}

	}
}
