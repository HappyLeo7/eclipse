package chap10HoSeong;

import java.util.Arrays;
import java.util.List;

public class Shape {

	// 변수 선언
	private String type;
	private String color;
	private Double area;

	// 생성자
	public Shape(String type, String color, Double area) {
		this.type = type;
		this.color = color;
		this.area = area;
	}

	// 접근제어자
	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public Double getArea() {
		return area;
	}

	// toString 출력값
	public String toString() {
		return String.format("%s, %s, %.1f", type, color, area);
	}

	// shapes 배열 생성
	public static final List<Shape> shapes = Arrays.asList(new Shape("삼각형", "빨간색", 10.5), new Shape("사각형", "파란색", 11.2),
			new Shape("원", "파란색", 16.5), new Shape("원", "빨간색", 5.3), new Shape("원", "노란색", 8.1),
			new Shape("사각형", "파란색", 20.7), new Shape("삼각형", "파란색", 3.4), new Shape("사각형", "빨간색", 12.6));

}
