package sec03;

public class _02Phone {

	String model;
	int value;

	void print() {
		System.out.println(value + "만원짜리 " + model + " 스마트폰");
//		System.out.println(this.value + "만원짜리 " + this.model + " 스마트폰");
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}
}
