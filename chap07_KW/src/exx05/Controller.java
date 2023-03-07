package exx05;
//추상클래스

public abstract class Controller {
	boolean power;

	public Controller(boolean power) {
		this.power = power;

	}

	abstract void show();
}
