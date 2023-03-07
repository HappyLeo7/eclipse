package ex03_X;

public class EnglishScore implements Comparable<EnglishScore> {
//필드
	// 이름
	// 성적

	String name;
	int score;

	// 매서드

	EnglishScore(String n, int s) {
		this.name = n;
		this.score = s;
	}

	public String toString() {
		return name + ", " + score;
	}

	public int compareTo(EnglishScore a) {
		return a.score - score;
	}
}
