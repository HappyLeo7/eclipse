package 정리;

import java.util.ArrayList;
import java.util.Arrays;

public class Test1 {
public static void main(String[] args) {

String[] i= {"가","나","다","라","a","b","c","d"};

//[]만들기
System.out.println(Arrays.toString(i));
ArrayList<String> a= new ArrayList<>(); //[] 생성
//나 다 c 를 찾아라
for(String m : i) {
//if(m=="나") {
//	a.add(m);
//}
		if(m.equals("나")||m.contains("다")||m.contains("c")) {
		a.add(m);
	}
}
System.out.println(a);



}
}
