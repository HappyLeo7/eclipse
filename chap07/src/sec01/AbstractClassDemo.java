package sec01;

public class AbstractClassDemo {
	public static void main(String[] args) {
//	Shape s = new Shape() {
//		
//		@Override
//		void draw() {
//			// TODO Auto-generated method stub
//			
//		}
		Circle c = new Circle(3);
		c.draw();
		System.out.printf("원의 넓이는 %.1f\n", c.findArea());
	}
}
