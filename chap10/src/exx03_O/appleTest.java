package exx03_O;

import java.util.function.Consumer;

public class appleTest {

//	static String test(int q,String w) {
//	}

	public static void main(String[] args) {
		int q = 1;
		int w = 2;
		int e = 5;
		if (q == 1) {
			Consumer<String> c1 = x -> System.out.println(x.toCharArray());
			;
			c1.accept("int 1= "+"apple.");
		}
		if (w >= 2) {
			Consumer<String> c1 = x -> System.out.println(x.toCharArray());
			;
			c1.accept("apples.");
		}
		if (e >= 2) {
			Consumer<String> c1 = x -> System.out.println(x.toCharArray());
			;
			c1.accept("apples.");
		}

	}

}
