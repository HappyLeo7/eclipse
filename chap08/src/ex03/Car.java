package ex03;

public class Car {
//필드
	private String model;

//생성자
	public Car(String model) {
		this.model = model;
	}

	public String toString() {
		return model;

	}

	@Override
	public boolean equals(Object i) {
		if (i instanceof Car) {
			Car c = (Car) i;
			if (model.equals(c.model)) {

			}
			return true;
		}
		return false;
	}

}
