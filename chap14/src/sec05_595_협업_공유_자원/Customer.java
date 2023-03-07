package sec05_595_협업_공유_자원;

public class Customer implements Runnable {
	private final Dish dish;

//생성자
	public Customer(Dish dish) {
		this.dish = dish;
	}

	private void eat(int i) throws InterruptedException {
		synchronized (dish) {
			while (dish.isEmpty())
				dish.wait();// 빈 접시면 대기.
			dish.setEmpty(true); // 접시에서 음식을 비운다.
			System.out.println(i + "번째 음식을 먹었습니다.");
			dish.notify();//요리요청
		}
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			try {
				eat(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {
			}
		}
	}
///////////////
}
