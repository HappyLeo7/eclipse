package sec04;

public class NoteBook extends Computer implements Portable {

	@Override
	public void inMybag() {
		System.out.println("노트북은 가방에 있다.");
	}

	@Override
	public void turnOn() {
		System.out.println("노트북을 켠다.");
	}

	@Override
	public void turnOff() {
		System.out.println("노트북을 끈다.");
	}

	@Override
	public void repair() {
		System.out.println("노트북을 수리합니다.");
	}

}
