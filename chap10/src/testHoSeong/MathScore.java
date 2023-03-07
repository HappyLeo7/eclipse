package testHoSeong;

public class MathScore implements Comparable<MathScore> { // 정렬하기 위해 상속받음

	// 변수 생성
	String name;
	int score;

	// 생성자
	public MathScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// toString 리턴값 지정
	public String toString() {
		return name + ", " + score;
	}

	// 내림차순 정렬
	@Override
	public int compareTo(MathScore o) {

		return o.score - score;
	}

}
