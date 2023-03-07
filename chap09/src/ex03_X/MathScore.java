package ex03_X;

public class MathScore implements Comparable<MathScore> {
//필드
	String name;
	int score;

	// 생성자 this
	MathScore(String n, int s) {
		this.name = n;
		this.score = s;
	}

	// 매서드 toString , compareTo

	public String toString() {
		return name + ", " + score;
	}

	public int compareTo(MathScore a) {
		return a.score - score;
	}

}
