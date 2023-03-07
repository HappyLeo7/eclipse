package ex01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
//	ArrayList<String> ss=new ArrayList<>();
		String[] lis = { "서울", "워싱턴", "베이징", "마드리드", "파리", "런던" };// 리스트 생성

		List<String> capitals = new ArrayList<>(); // 변수 수도
		System.out.println("리스트 배열화 : "+Arrays.toString(lis)); // 리스트를 배열로 출력
		System.out.println("빈 capitals 배열 : "+capitals);
		for (String list : lis) { //for 을 사용해서 리스트들을 하나하나 list에 넣어준다.
			System.out.print(list+" ");}
//			capitals.add(list); // 현재 capitals 배열에는 빈공간이라 출력된 list를 하나하나 넣어준다.
//		System.out.println("for을 사용한 배열화 : "+capitals);
	}
}
