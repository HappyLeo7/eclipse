package exx06;
//인터페이스
public interface Human {
//필드
	
	//매서드
	void eat();
	default void print() {
		System.out.println("인간입니다.");
	}
	static void echo() {
System.out.println("야호!!!");
	}
}
