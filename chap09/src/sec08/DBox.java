package sec08;

public class DBox<L, R> {// L과 R 은 비어있는 타입

	// 필드
	private L left;
	private R right;

//set 은 this 지정
	public void set(L left, R right) {
		this.left = left;
		this.right = right;
	}

	public String toString() {
		return left + " & " + right;
	}

}
