package ex01;

public class BestScoreTest {
	public static void main(String[] args) {
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		System.out.println("영어 최고 점수 : " + findBest(ea));
	}

	static EnglishScore findBest(EnglishScore[] a) { // 타입 변수 return
		EnglishScore best = a[0]; // 기준 점수 설정

		for (EnglishScore e : a) { // 리스트 a을 각각 e배열 에 넣는다.
			if (best.compareTo(e) < 0) { // if문을 이용하여 compareTo 매서드에 있는 수식을 가지고 와서 계산

				best = e; // * 기준값보다 음수로 나오면 best에 삽입 하여 출력
			}
		}
		return best; // 계산값이 양수일땐 기존값이 크기 때문에 그대로 기준값이 들어온다
	}
}
