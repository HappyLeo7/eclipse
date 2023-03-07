package sec06_T;

public class Cup<T extends AllCup> {
//필드
	private T cup;

//생성자 
	public T getCup() {
		return cup;
	}

	// 매서드
	void setCup(T cup) {
		this.cup = cup;
	}

}
