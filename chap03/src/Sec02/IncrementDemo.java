package Sec02;

public class IncrementDemo {
	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의 x는 " + x);
		increment(x);
		System.out.println("increment() 메서드를 호출한 후의 x는 " + x);
//		System.out.println("increment() 메서드를 호출한 후의 y는 " + y);

	}

//위 x 와 아래 x 는 서로 다르다 int x 를로 변수를 생성하면 방이 하나더 생기면서 서로다르다

	public static void increment(int x) {
		System.out.println("increment() 메서드를 시작할 때의 x는" + x);
		x++;
		System.out.println("increment() 메서드를 끝날 때의 x는" + x);

	}

}
