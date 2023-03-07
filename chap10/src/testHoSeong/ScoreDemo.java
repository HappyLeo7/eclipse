package testHoSeong;

import java.util.Arrays;

public class ScoreDemo {

	// 제네릭 메서드를 써서 배열을 받아서 정렬 후 리턴하게끔 설정
	static <T> T findBest(T[] a) {
		Arrays.sort(a);
		T best = a[0];

		return best;
	}

	// String 이름을 받지만 영어와 수학을 다 받을 수 있게 제네릭을 씀
	static <T> T findScore(T[] a, String name) throws Exception { // 오류를 메인으로 던져줌
		int i = 0; // 변수생성
		T names = null; // 이름을 안적을 시 null값으로 지정하여 throws를 쓸 수 있게 넣어둠

		// 배열을 돌려서 들어온 이름값과 배열속 이름값이 맞는걸 찾은 후 break걸어서 나오게끔
		for (int j = 0; j < a.length - 1; j++) {
			if (a[i].toString().substring(0, 3).equals(name)) {
				names = a[i];
				break;
			} else {
				i++;
			}
		}
		// 만약 배열속 없는 이름이면 null값으로 출력되게 했으므로 그럴경우 exception을 강제로 만듬
		if (names == null)
			throw new Exception();

		return names;

	}

	public static void main(String[] args) {
		String name = "null";
		EnglishScore[] ea = { new EnglishScore("김삿갓", 77), new EnglishScore("장영실", 88), new EnglishScore("홍길동", 99) };
		MathScore[] ma = { new MathScore("김삿갓", 80), new MathScore("장영실", 98), new MathScore("홍길동", 70) };

		System.out.println("영어 최고 점수 : " + findBest(ea));
		System.out.println("수학 최고 점수 : " + findBest(ma));

		try {
			name = args[0];

			System.out.println("영어    점수 : " + findScore(ea, name));
			System.out.println("수학    점수 : " + findScore(ma, name));
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("명령행 인자가 없습니다."); // index범위 초과시 명령행 인자가 없습니다 출력
		} catch (Exception e) {
			System.out.println("이름이 다릅니다."); // 그 외 오류들 이름이 다릅니다로 출력(throw로 받은 오류)
		}

	}
}
