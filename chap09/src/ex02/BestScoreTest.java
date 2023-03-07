package ex02;

import java.util.Arrays;

public class BestScoreTest {
	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };
		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));
	}

	static <T> T findBest(T[] a) {
		T best = a[0];
		Arrays.sort(a); // a의 배열을 나열해서 정령 한다
		best = a[0]; // 그리고 맨앞의 배열을 불러온다

		return best;
	}

//	static EnglishScore findBest(EnglishScore[] a) { // 타입 변수 return
//		EnglishScore best = a[0]; // 기준 점수 설정
//
//		for (EnglishScore e : a) { // 리스트 a을 각각 e배열 에 넣는다.
//			if (best.compareTo(e) < 0) { // if문을 이용하여 compareTo 매서드에 있는 수식을 가지고 와서 계산
//
//				best = e; // * 기준값보다 음수로 나오면 best에 삽입 하여 출력
//			}
//		}
//		return best; // 계산값이 양수일땐 기존값이 크기 때문에 그대로 기준값이 들어온다
//	}
}
