package sec07;

public class MovableDemo {
	public static void main(String[] args) {
//		Movable m = new Car();
//		m.move(5);
//		// m.show show의 타입이 Car가 아니고 Movable이기때문에 사용불가
//		// m에 5를 받고 누적되어서 아래로 내려가서 최종 15가 나옴 
//		Car c = (Car) m;
//		c.move(10);
//		c.speed(15);
//		c.show();

		Movable[] m = { new Car(), new airplane() };
		for (Movable ms : m) {
			ms.move(100);
			ms.speed(10);
			airplane b = (airplane) ms;
			Car c = (Car) ms;
//			airplane c = (airplane) ms
			c.show();
			b.show();
		}

	}
}
