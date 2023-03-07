package 정리;

import java.util.ArrayList;
import java.util.Arrays;

public class _2차열배열 {
public static void main(String[] args) {
	
	int[][] s= {
			
			{100,100,100},
			{20,20,20},
			{30,30,30}
			
			
			
			
	};
	
	int[] s1= {100,200,300,400};
	
	
	System.out.println(Arrays.toString(s1));
ArrayList n = new ArrayList<>();
	for(int i=0;i<s.length;i++) {
		for(int j=0;j<s[i].length;j++) {
n.add(s[i][j]);
		}
		}
	System.out.println(n);
	//			012345678 index
	String sss="123456789";
 
 System.out.println(sss.charAt(0));
 System.out.println(sss.length()); // String의 매서드()이고 글자의 길이를 읽어준다. 
 System.out.println(sss.substring(3)); // substring() index 0~3번째 숫자부터 출력
 System.out.println(sss.substring(3,8)); // index 3~7까지의 숫자 출력
}
}
