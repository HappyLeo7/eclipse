package sec07;

public class airplane implements Movable {

	// 필드
	private int pos = 0;
	private int sp = 0;

	@Override
	public void move(int x) {
		pos += x;
	}

	@Override
	public void speed(int s) {
		sp += s;
	}

	public void show() {
		System.out.println(sp + "속도로" + pos + "m 이동했습니다.");
	}

}
