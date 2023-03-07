package sec04;

public class ControllableDemo {
	public static void main(String[] args) {
		Tv tv = new Tv(); // tv타입
		Computer com = new Computer(); // com타입
		tv.turnOn();
		tv.turnOff();
		tv.repair();

		com.turnOn();
		com.turnOff();
		com.repair();

		Controllable.reset();

	}
}
