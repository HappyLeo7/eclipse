package ex03_X;

import java.util.Arrays;

public class BestScoreTest {
	public static void main(String[] args) {

		// 영어성적 리스트 작성
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };
		String name = null;
//		String name = null;

		System.out.println("영어 최고 점수 : " + findBest(ea)); // findBest() 코드필요
		System.out.println("수학 최고 점수 : " + findBest(ma)); // findBest() 코드필요

		// args에 이름이 없을 때 예외 처리 코드
		try {
//		System.out.println(name);
			name = args[0];
			System.out.println("영어\t점수 : " + findScore(ea, name));
			System.out.println("수학\t점수 : " + findScore(ma, name));
		} catch (Exception e) {
			System.out.println("명령행 인자가 없습니다.");
		}
	}

	static <T> T findBest(T[] ea) { 
//		T bb = ea[0];
		Arrays.sort(ea);
		T bb = ea[0];
		return bb;
	}

	static <T> T findScore(T[] a, T name) throws Exception { // throw로 메인으로 보내야한다.
		
//T name=null;
//반복해서 배열에 들어오게 만들기
		T w1=null;
for(int i=0; i<a.length;i++) {
	if(a[i]                       //1. 배열 위치를 부른다.
			.toString()           // 2. 배열을 불러온다 toString을 통해서
			.substring(0,3)       //3.index부터 문자열 반환해온다
			.equals(name)) {       //equals를 통해 문자 찾기
		w1 = a[i];
	}
	}

	if( w1==null) {
		throw new Exception();
	}return  w1;
		
		////동완님 코드////
//	      T who = null;
//	      for (int num = 0; num < a.length; num++) {
//	         if (a[num].toString().substring(0, 3).equals(name)) { // contains로 했다가 문제에 있는 해법대로 그냥 다시 풀었습니다...
//	            who = a[num];
//	         }
//	      }
//	      if (who == null) {
//	         throw new Exception(); // 검사형 예외기 때문에 throws로 던져줘야함
//	      }
//	      return  who;
		///////////////////

	
		
		
	}
}
