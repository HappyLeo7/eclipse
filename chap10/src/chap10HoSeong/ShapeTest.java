package chap10HoSeong;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {

		List<Shape> shapesType = findShapesByType(Shape.shapes, "사각형"); // 사각형만 찾게끔 메서드 접근
		List<Shape> shapesColor = findShapesByColorNArea(Shape.shapes, "빨간색", 12.0); // 빨간색 12.0이상만 찾게끔 메서드 접근

		System.out.println("사각형 : " + shapesType);
		System.out.println("빨간색 도형 : " + shapesColor);

	}

	// List값과 type값만 받아서 맞는 타입을 if로 분류해서 출력
	static List<Shape> findShapesByType(List<Shape> shapes, String type) {

		List<Shape> result = new ArrayList<>();

		for (Shape shape : shapes) {
			if (shape.getType().equals(type))
				result.add(shape);
		}

		return result;

	}

	// List값과 color, area값만 받아서 if로 분류하여 출력
	static List<Shape> findShapesByColorNArea(List<Shape> shapes, String color, double area) {
		List<Shape> result = new ArrayList<>();

		for (Shape shape : shapes) {
			if (shape.getColor().equals(color))
				if (shape.getArea() < area)
					result.add(shape);
		}

		return result;
	}

}
