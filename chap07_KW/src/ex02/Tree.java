package ex02;

public class Tree implements Countable{

	//필드
	String name;
	
	//생성자
	public Tree(String name){
		this.name=name;
	}
	
	//매서드
	public void ripen() {
		System.out.println(name+"에 열매가 잘 익었다.");
	}

	@Override
	public void count() {
		System.out.println(name+"가 5그루 있다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
