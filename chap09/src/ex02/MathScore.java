package ex02;

public class MathScore implements Comparable<MathScore> {
//필드 초기값 선언
	String name;
	int score;

//생성자
	MathScore(String n, int s) {
		this.name = n;
		this.score = s;
	}

//toString 값을 리턴해서 출력
	public String toString() {
		return name + ", " + score;
	}

	// compareTo 메서드를 만들어서 두개의 점수를 비교하여 기준값이 크면 + 작으면 - 나오게 계산식을 만든다.
	public int compareTo(MathScore m) {
		return -(score - m.score);
	}

}
