package sec01;

public class Rectangle implements Comparable<Rectangle> {
//필드
	private int width, height;

//생성자
	public Rectangle(int w, int h) {
		this.width = w;
		this.height = h;
	}

	public int findArea() {
		return width * height;
	}

	public String soString() {
//		return "사각형 [폭=" + width + ", 높이" + height + "]";
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}

	public int compareTo(Rectangle o) {
		return findArea() - o.findArea();
//		return o.findArea() - findArea();

	}
}
