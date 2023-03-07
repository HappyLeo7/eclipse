package chap10HoSeong._2;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {

		List<Shape> shapesType = findShapes(Shape.shapes, "사각형", "", 0.0);
		List<Shape> shapesColor = findShapes(Shape.shapes, "", "빨간색", 12.0);

		System.out.println("사각형 : " + shapesType);
		System.out.println("빨간색 도형 : " + shapesColor);

	}

	// 하나로 합쳤지만 공백이거나 0.0이면 모든걸 출력하게끔하여 메서드를 하나로 합침
	static List<Shape> findShapes(List<Shape> shapes, String type, String color, Double area) {
		List<Shape> result = new ArrayList<>();

		for (Shape shape : shapes) {
			if (shape.getType().equals(type) || type == "")
				if (shape.getColor().equals(color) || color == "")
					if (shape.getArea() < area || area == 0.0)
						result.add(shape);

		}

		return result;

	}

}
