package sec01;

public class Keyboard {
	// 멤버 변수

	String name;

	// 생성자
	public Keyboard(String n) {
		this.name = n;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Keyboard) {
			Keyboard k = (Keyboard) obj;
			if (name.equals(k.name))
				return true;
		}
		return false;

	}

	public String toString() {
		return "키보드입니다.";
	}

}