package exx04_O;

import java.util.function.ToIntFunction;
import java.util.function.UnaryOperator;

public class Function {
public static void main(String[] args) {
	ToIntFunction<Integer> a = x -> x;
	ToIntFunction<String> a1 = x -> x.length();
	
	System.out.println("ToIntFunction : ");
	
	int m =a.applyAsInt(10);
	String m1= Integer.toString(m);
	int m2=m1.length();
	System.out.println("length("+m+") = "+m2);
	
	int c =a.applyAsInt(100);
	String c1= Integer.toString(c);
	int c2=c1.length();
	System.out.println("length("+c+") = "+c2);
	
	int h =a.applyAsInt(1000);
	String h1= Integer.toString(h);
	int h2=h1.length();
	System.out.println("length("+h+") = "+h2);

	System.out.println();
	
	
	UnaryOperator<Integer> b=x->x;
	System.out.println("UnaryOperator : ");
	int q11=b.apply(10);
	System.out.println("length("+q11+") ="+Integer.toString(q11).length());
	
	int q12=b.apply(100);
	System.out.println("length("+q12+") ="+Integer.toString(q12).length());
	
	int q13=b.apply(1000);
	System.out.println("length("+q13+") ="+Integer.toString(q13).length());
	
	
	
	
	//	}
}
}
