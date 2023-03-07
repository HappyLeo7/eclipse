package ex02;

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

///////////////////////////////////////////////////////////////
	public boolean equals(Object o) {
		if (o instanceof Car) {
			return model.equals(((Car) o).model);
		} else {
			return false;
		}
	}

// 위아래 같은 내용

//	@Override
//	public boolean equals(Object i) {
//		if (i instanceof Car) {
//			Car c = (Car) i;
//			if (model.equals(c.model)) {
//
//			}
//			return true;
//		}
//		return false;
//	}
///////////////////////////////////////////////////////////////////
}
