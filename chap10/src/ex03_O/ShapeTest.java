package ex03_O;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ShapeTest {
	public static void main(String[] args) {
		ArrayList<Shape> s = new ArrayList<>();

		s.add(new Shape("삼각형", "빨간색", 10.5));
		s.add(new Shape("사각형", "파란색", 11.2));
		s.add(new Shape("원", "파란색", 16.5));
		s.add(new Shape("원", "빨간색", 5.3));
		s.add(new Shape("원", "노란색", 8.1));
		s.add(new Shape("사각형", "파란색", 20.7));
		s.add(new Shape("삼각형", "파란색", 3.4));
		s.add(new Shape("사각형", "빨간색", 12.6));
//		System.out.println(findShapesByType(s, "사각형"));
//		System.out.println(findShapesByColorNarea(s, "빨간", 12.0));
//		System.out.println(findShapes(s, "사각형", "빨간", 12.0));
		System.out.println(findShapes(s, y->y.getStirng().equals("사각형")));
		System.out.println(findShapes(s, 
				x->(x.getcolor().contains("빨"))&&(x.getArea()<12.0)));
		
	}

///////////////////////////////////////////////////////////////////////////
/// 요구매서드//

	static List<Shape> findShapes(List<Shape> s, Predicate<Shape> p) {
		List<Shape> ff = new ArrayList<>();
		for (Shape a : s) {
			boolean g=p.test(a);
		if(g) {
			ff.add(a);
			}
		
		}

		return ff;
	}

//	static List<Shape> findShapes(List<Shape> s, String type, String color,Double area){
//		List<Shape> ff=new ArrayList<>();
//		
//		for(Shape a:s) { // s 배열을 a에 하나씩 넣어준다.
//			boolean c1 = a.toString().equals(type); // 하나씩 들어온 a 를 type와 비교한다.
//			if(c1==true) {
//				ff.add(a);
//			}
//			
//			boolean c2 = true;
//			if(a.toString().contains(color)== c2) {
//				if(a.getArea()<area){
//			
//			
//				ff.add(a);
//			}}
//		}
//		
//		return ff;
//		
//		
//	}
/////////////////////////////////////////////////////////////////	
//	static List<Shape> findShapesByType(List<Shape> s, String type) {
//		List<Shape> fff = new ArrayList<>();
//		boolean a;
//		System.out.print(type + " : ");
//		for (Shape a1 : s) {
//			a = a1.toString().contains(type);
//			if (a == true) {
//				fff.add(a1);
//			}
//
//		}
//		return fff;
//	}
//
//	static List<Shape> findShapesByColorNarea(List<Shape> s, String color, Double area) {
//		List<Shape> fff = new ArrayList<>(); // 이소스는 Shape 타입의 [] 을 생성해준다 사용시 변수fff.add를 한다.
//		System.out.print(color + " 도형(면적<=" + area + ") : ");
//
//		for (Shape a1 : s) {
//			boolean a = a1.toString().contains(color);
//			if (a == true) {
//
//			if (a1.getArea() < 12.0) {
//					fff.add(a1);
//
//				}}
//
//		}
//		return fff;
//
//	}
}
