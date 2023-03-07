package ex_1;

public class BestGirl extends GoodGirl {
	private String name;

	public BestGirl(String name) {
		super(name);
		this.name = name;
	}

	public void show() {
		System.out.println(name + "는 자바를 무지하게 잘안다");
	}
}
