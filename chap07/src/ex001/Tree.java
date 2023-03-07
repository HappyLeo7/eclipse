package ex001;

public class Tree implements Countable {
	String name;

	Tree(String name) {
		this.name = name;
	}

	public void ripen() {
		System.out.println(name + "가 5그루 있다");
	}

	@Override
	public void fly() {
		// TODO Auto-generated method stub

	}

	@Override
	public void count() {
		System.out.println(name + "가 5그루 있다");

	}
}
