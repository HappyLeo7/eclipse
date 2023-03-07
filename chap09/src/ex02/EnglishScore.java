package ex02;

public class EnglishScore implements Comparable<EnglishScore> {
	String name;
	int score;

//생성자  변수(? , ?) / this
	EnglishScore(String n, int s) {
		this.name = n;
		this.score = s;
	}

	public String toString() {
		// 이름과 점수로 구성된 문자열을 반환하는 코드
		return "이름 : " + name + ", 점수 : " + score;
	}

	public int compareTo(EnglishScore e) {
		return -(score - e.score); // 점수 값 수식 "기준점수 - 나중점수" return
	}

}
