package 다이아문제;

//import java.util.ArrayList;

public class DI {
	public static void main(String[] args) {
		int aq = 5;

		for(int l=0;l<aq;l++) {
		if(l==0&&l==1&&l==2&&l==3)
		System.out.println("0");
		
//		System.out.print((aq / 2 == 3) ? "0" : "1");
//		System.out.print((aq / 2 == 2) ? "0" : "1");
//		System.out.print((aq / 2 == 3) ? "0" : "1");
//		System.out.print((aq / 2 == 3) ? "0" : "1");
		continue;
		}
		System.out.println();

//		System.out.print((aq / 2 == 3) ? "0" : "1");
//		System.out.print((aq / 2 == 2) ? "0" : "1");
//		System.out.print((aq / 2 == 2) ? "0" : "1");
//		System.out.print((aq / 2 == 2) ? "0" : "1");
//		System.out.print((aq / 2 == 3) ? "0" : "1");

		System.out.println();
		System.out.println();

		/*
		 * 12 3 45 1 234 5 12345
		 */
		for (int i = 0; i < aq; i++) {
		}

		int p = 5;

		int n = p - 2;
		String[] a = new String[n];
		String[] b = new String[n];
		String[] c = new String[n]; // 배열 5개 생성

		String m = "9";
		String q = "0";

		a[0] = m.repeat(n);
		b[0] = q.repeat(n);
		int j = 1;
		for (int i = 0; i <= (n / 2); i++) { // i<4
			System.out.println(
					a[0].substring(0, ((n / 2) + 1) - i) + b[0].substring(0, j) + a[0].substring(0, ((n / 2) + 1) - i));
			j++;
			j++;
		}
		b[0] = q.repeat(n + 2);
		System.out.println(b[0]);

		a[0] = m.repeat(n);
		b[0] = q.repeat(n);
		j = 0;
		for (int i = 1; i <= (n / 2) + 1; i++) { // i<4

			System.out.println(a[0].substring(0, (i)) + b[0].substring(0, (n) - j) + a[0].substring(0, (i)));
			j++;
			j++;

		}

	}
}