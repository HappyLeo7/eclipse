package exx05_O;

import java.util.function.UnaryOperator;

public class Oper {
	public static void main(String[] args) {
	FirstString aa = new FirstString();
	
	UnaryOperator<String> aa1= a->aa.startsWith(a);	
	
	System.out.println(aa1.apply("gsdaf"));
	
	
	UnaryOperator<String> aa2= a->aa.startsWith1(a);	
	System.out.println(aa2.apply("gsdaf"));
	UnaryOperator<String> aa3= a->aa.startsWith2(a);	
	System.out.println(aa3.apply("gsdaf"));
	UnaryOperator<String> aa4= a->aa.startsWith3(a);	
	System.out.println(aa4.apply("gsdaf"));
	}
}
