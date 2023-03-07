package 정리;

import java.util.ArrayList;
import java.util.Arrays;

public class 배열 {
public static void main(String[] args) {
//	int[] num = {0,1,2,3,4,5,6,7,8,9};
//	System.out.println(num);  // 주소가나옴
//	System.out.println(Arrays.toString(num)); // 배열형태가 나옴
//	
//	for(int i=0; i<2;i++) {
//		int n=(int)(Math.random()*10);
////		int a= (int) Math.random();//랜덤함수사용
//		int tm=num[i]; // 배열i를 tm에 넣는다 
//		num[i]=num[n]; // 무작위 배열 1개를 i배열에 넣는다.
//		num[n]=tm;     // 
//	
//	}
//	System.out.println(Arrays.toString(num));
//}

// int 정수 
// String 문자
	
	int[] in= {1,2,3,4,5,6,7};
//	String[] ch= {"a","b","c"};
	
	System.out.println( Arrays.toString(in) );
//	System.out.println(ch);
//	ArrayList<Integer> a = new ArrayList<>();
	ArrayList<Integer>a =new ArrayList<>(); 
	System.out.println(a);
	
	for(int m:in) {
		System.out.println(m);
	}
	
	
}
}