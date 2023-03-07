package exx01;

public class Concrete extends Abstract {
	// 필드
	int j;

	public Concrete(int i, int j) {
		super(i);
		this.j = j;
	}

//매서드
	void show() {
		System.out.print("i = " + i);
		System.out.print(",j = " + j);

	}
}
