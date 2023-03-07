package ex01_O;

import java.util.ArrayList;
import java.util.List;

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
//		System.out.println("s배열[] =" + s);
		System.out.println(findShapesByType(s, "사각형"));
		System.out.println(findShapesByColorNarea(s, "빨간",12.0));

//		List<Shape> ol = findShapesByColorNarea(s, "빨간", s.get(0));
		
	}

///////////////////////////////////////////////////////////////////////////
/// 요구매서드//
	static List<Shape> findShapesByType(List<Shape> s, String type) {
		List<Shape> fff=new ArrayList<>();
		boolean a;
//		System.out.println(type);
		System.out.print(type + " : ");
		for (Shape a1 : s) {
			a = a1.toString().contains(type);
			if (a == true) {
;
fff.add(a1);
//			System.out.println("a(else): "+a);
		}
			
	
		}
//		System.out.println("\b");
		return fff;
	}
	static List<Shape> findShapesByColorNarea(List<Shape> s, String color, Double area) {
		List<Shape> fff=new ArrayList<>(); // 이소스는 Shape 타입의 [] 을 생성해준다 사용시 변수fff.add를 한다.
		System.out.print(color+" 도형(면적<="+area+") : ");

		
		for(Shape a1:s) {
			boolean a =a1.toString().contains(color);
		if(a==true) 
	
		
			if(a1.getArea()<area){
			fff.add(a1);
				
			}
			
		
		}return fff;

	}
}

