package Sec02;

public class Method03 {

	public static void main(String[] args) {
		in("안녕!", 4);
	}

	public static void in(String s, int n) {
		for (int a = 0; a < n; a++)
			System.out.println(s);
	}
}
