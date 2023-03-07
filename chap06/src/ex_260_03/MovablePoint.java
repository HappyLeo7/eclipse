package ex_260_03;

public class MovablePoint extends Point {
	private int xSpeed, ySpeed;

	// 생성자
	public MovablePoint(int x, int y, int xx, int yy) {
		super(x, y);
		this.xSpeed = xx;
		this.ySpeed = yy;
	}

	public int getxSpeed() {
		return xSpeed;
	}

	public int getySpeed() {
		return ySpeed;
	}

//	public String toString() {
//		return 1;
//	}

}
