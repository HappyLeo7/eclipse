package sec05;

import sec04.Computer;
import sec04.Controllable;
import sec04.NoteBook;
import sec04.Tv;

//public class ControllableDemo {
//	public static void main(String[] args) {
//		Controllable[] controllable = { new Tv(), new Computer(), new NoteBook() };
//
//		for (Controllable c : controllable) {
//			c.turnOn();
//			c.turnOff();
//			c.repair();
//			System.out.println();
//		}
//		Controllable.reset();
//	}
//}

public class ControllableDemo {
	public static void main(String[] args) {
		Controllable[] controllable = { new Tv(), new Computer(), new NoteBook() };

		for (Controllable c : controllable) {
			c.turnOn();
			c.turnOff();
			c.repair();
			System.out.println();
		}
		Controllable.reset();
	}

	private static void ccco(Controllable a) {
		a.turnOn();
		a.turnOff();
		a.repair();
		System.out.println();
	}
}
