package sec08;

class Cake {// 부모
}

class CheeseCake extends Cake { // 자식 extends 부모
}

class StrawberryCheeseCake extends CheeseCake { // 자식 extends 부모
}

public class _YummyCakeOf {
	public static void main(String[] args) {

//		Cake cake = new StrawberryCheeseCake();
//		StrawberryCheeseCake cake = new StrawberryCheeseCake();
		CheeseCake cake = new StrawberryCheeseCake();

		if (cake instanceof Cake) {
			System.out.println("케익 인스턴스 or");
			System.out.println("케익을 상속하는 인스턴스 \n");
		}
		if (cake instanceof CheeseCake) {
			System.out.println("치즈케익 인스턴스 or");
			System.out.println("치즈케익을 상속하는 인스턴스 \n");
		}
		if (cake instanceof StrawberryCheeseCake) {
			System.out.println("딸기치즈케익 인스턴스 or");
			System.out.println("딸기치즈케익을 상속하는 인스턴스 \n");
		}
	}

}
