package chap10HoSeong._3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ShapeTest {

	public static void main(String[] args) {

		// 람다식으로 접근
		List<Shape> shapesType = findShapes(Shape.shapes, s -> s.getType().equals("사각형"));
		List<Shape> shapesColor = findShapes(Shape.shapes, s -> s.getColor().equals("빨간색") && s.getArea() < 12.0);

		System.out.println("사각형 : " + shapesType);
		System.out.println("빨간색 도형 : " + shapesColor);

	}

	// Predicate로 접근시켜 들어오는 내용과 equals를 넣어 비교 가능하게끔 생성
	static List<Shape> findShapes(List<Shape> shapes, Predicate<Shape> p) {
		List<Shape> result = new ArrayList<>();

		for (Shape shape : shapes) {
			if (p.test(shape))
				result.add(shape);
		}

		return result;
	}

}
