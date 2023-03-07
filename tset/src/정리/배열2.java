package 정리;

import java.util.Arrays;

public class 배열2 {
public static void main(String[] args) {
	 String[] strArr= {"가위","바위","보"};
	 System.out.println(Arrays.toString(strArr));
	 
	 //랜덤으로 섞어야한다.
	 for(int i=0;i<10;i++) {
	int tt= (int)(Math.random()*3);	//갈호가 중요함 // tt에 랜덤0~2값이 들어감 
	System.out.println(Math.random());
	System.out.print(tt+" ");
	 System.out.print(strArr[tt]+" ");
}}
}
