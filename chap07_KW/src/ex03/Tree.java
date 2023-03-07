package ex03;

public class Tree extends CountableClass{

	//필드
	String name;
	
	//생성자
	public Tree(String name,int num){
		super(name, num);
		this.name=name;
	}
	
	//매서드
	public void ripen() {
		System.out.println(num+"그루 "+name+"에 열매가 잘 익었다.");
	}

	@Override
	public void count() {
		System.out.println(name+"가 "+num+"그루 있다.");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub
		
	}
}
