package chap10HoSeong.p4;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Demo {

	public static void main(String[] args) {

		ToIntFunction<String> i1 = i -> i.length();
		System.out.println("ToIntFunction : ");
		System.out.println("lnegth(10) = " + i1.applyAsInt("10"));
		System.out.println("lnegth(100) = " + i1.applyAsInt("100"));
		System.out.println("lnegth(1000 = )" + i1.applyAsInt("1000"));

		System.out.println();

		UnaryOperator<Integer> i2 = i -> i.toString().length();
//		System.out.println("UnaryOperator : ");
//		System.out.println("lnegth(10) = " + i2.apply("10"));
//		System.out.println("lnegth(100) = " + i2.apply("100"));
//		System.out.println("lnegth(1000) = " + i2.apply("1000"));
	}

}
