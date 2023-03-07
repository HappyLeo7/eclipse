package exx03;

public class Book {
//필드
	int price;
//생성자
	
	public Book(int i) {
		this.price=i;
	}

	//매서드\
	void show() {
		System.out.println("Book [price="+price+"]");
	}
}
