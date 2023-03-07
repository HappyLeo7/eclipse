package testHoSeong;

public class EnglishScore implements Comparable<EnglishScore> { // 정렬하기 위해 Comparable을 상속받음
	// 변수 생성
	String name;
	int score;

	// 생성자에서 네임, 스코어 넣음
	public EnglishScore(String name, int score) {
		this.name = name;
		this.score = score;
	}

	// toString값을 지정하여 넣음
	public String toString() {
		return name + ", " + score;
	}

	// 내림차순 정렬
	@Override
	public int compareTo(EnglishScore o) {

		return o.score - score;
	}

}
