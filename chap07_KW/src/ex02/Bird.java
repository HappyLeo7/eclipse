package ex02;

public class Bird implements Countable{
//필드
	String name;
	
	
//생성자
	public Bird(String name){
		this.name=name; //name 지정
	}
	
//매서드
	public void fly() {
		System.out.println("2마리 "+name+"가 날아간다.");
	}

	@Override
	public void count() {
		System.out.println(name+"가 2마리 있다.");
	}

	@Override
	public void ripen() {
		// TODO Auto-generated method stub
		
	}
}
