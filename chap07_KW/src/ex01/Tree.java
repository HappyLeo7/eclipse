package ex01;

public class Tree implements Countable{

	//필드
	String name;
	
	//생성자
	public Tree(String name){
		this.name=name;
	}
	
	//매서드
	void ripen() {
	}

	@Override
	public void count() {
		System.out.println(name+"가 2마리 있다.");
	}
}
