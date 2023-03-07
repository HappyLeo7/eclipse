package ex01;

public class Bird implements Countable{
//필드
	String name;
	
	
//생성자
	public Bird(String name){
		this.name=name; //name 지정
	}
	
//매서드
	void fly() {
	}

	@Override
	public void count() {
		System.out.println(name+"가 5그루 있다.");
	}
}
