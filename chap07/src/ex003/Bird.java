package ex003;

public class Bird implements Countable {
	String name;

	Bird(String name) {
		this.name = name;
	}

	@Override
	public void fly() {
		System.out.println("2마리" + name + "가 있다");
	}

	@Override
	public void ripen() {
		// TODO Auto-generated method stub

	}

	@Override
	public void count() {
		System.out.println(name + "가 2마리가 있다");

	}

}
