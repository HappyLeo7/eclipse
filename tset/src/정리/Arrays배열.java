
package 정리;

import java.util.Arrays;

public class Arrays배열 {
public static void main(String[] args) {
	
	
	int q=Math.round(0); //반올림
	double w=Math.random(); //랜덤

			  //0 1 2 3 4 5 7 8 9
	int[] arr= {1,2,3,4,1,5,6,1,2};  //1차원
	int[] arr1= {1,2,3,4,1,5,6,1,2};  //1차원
	int[][] arr2 = {{1,2,3},
			 		{4,12,3},
			 		{12,313,415}}; //2차원
	
	int[][] arr22 = 
   {{1,2,3},
    {4,12,3},
    {12,313,415}}; //2차원

	//1차원 배열 부르는 방법 Arrays.toString 사용
	String z = Arrays.toString(arr);
	System.out.println(z);
	//2차원 배열 부르는 방법 Arrays.deepToString 사용
	String z2= Arrays.deepToString(arr2);
	System.out.println(z2);
	
	//비교해보기
	//1차배열 비교
	boolean a=Arrays.equals(arr, arr1);
	System.out.println("1차배열 비교: "+a);
//	System.out.println(arr1.equals(arr)); //비교불가
	//2차배열 비교
	Object b=Arrays.deepEquals(arr2, arr22);
	System.out.println("2차배열 비교: "+b);
	
	//배열 복사 .copyOf
	int[] i=Arrays.copyOf(arr,5);
	int[] ii=Arrays.copyOfRange(arr, 2, 8);
	int[][] i22=Arrays.copyOfRange(arr2,0, 2);
	System.out.println("i22: "+Arrays.deepToString(i22));
	int[][] i2=Arrays.copyOf(arr2, arr2.length);
	System.out.println(Arrays.toString(ii));
	System.out.println(Arrays.toString(i));
	System.out.println(Arrays.deepToString(i2));
	
	//정렬 매서드 .sort()
	System.out.println(Arrays.toString( arr));
	// System.out.printf(Arrays.sort(arr)); // sort출력불가 ( 정렬해주기때문에)
	System.out.println(Arrays.toString( arr));

}
}
