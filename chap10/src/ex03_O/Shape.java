package ex03_O;

public class Shape {

	// 필드
	private String type; // 도형 종류
	private String color; // 도형 색깔
	private Double area; // 도형 면적

	//생성자
	Shape(String t, String c, double a) {
		this.type = t;
		this.color = c;
		this.area = a;
	}
public Double getArea() {
	return area;
}
public String getStirng() {
	return type;
}
public String getcolor() {
	return color;
}
	
	// toString()
	public String toString() {
		return this.type + "(" + color + ", " + area+")";
	}

}
