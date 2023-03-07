package 배열_연습;

import java.util.ArrayList;
import java.util.Arrays;

public class tx {
	public static void main(String[] args) {
		
	
	int[] in= {1,2,3,4,5,6,7};
//	String[] ch= {"a","b","c"};
//	System.out.println(ch);

	System.out.println( Arrays.toString(in) );
	
	ArrayList<Integer>a =new ArrayList<>(); 
    System.out.println("주소값 in : "+in);   //in + a = 주소   + []
	System.out.println("new ArrayList= "+a);
	System.out.println("? : "+a.add(100));
		for(int m:in) {
		(new ArrayList<>()).add(m);
		a.add(m);
//		if(m==3||m==5) {
			
//		}
	}
		System.out.println("new : "+new ArrayList<>());
		System.out.println("a: "+a);
}}
