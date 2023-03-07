package ex_1;

public class GoodGirl extends Girl {
	private String name;

	public GoodGirl(String name) {
		super(name);
		this.name = name;
	}

	public void show() {
		System.out.println(name + "는 자바를 잘 안다.");
	}
}
