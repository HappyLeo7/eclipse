package sec05_595_협업_공유_자원;

public class Cook implements Runnable{
private final Dish dish;

public Cook(Dish dish) {
	this.dish=dish;
}

private void cook(int i) throws InterruptedException{
	synchronized(dish) {
		while(!dish.isEmpty())
			dish.wait(); // 빈접시가 아니면 대기한다.
		
			dish.setEmpty(false); //접시를 음식으로 채운다.
		System.out.println(i+"번째 음식이 준비되었습니다.");
		dish.notify(); //음식이 준비되었다고 알림.
	}
}

public void run() {
	for(int i=0;i<5;i++) {
		try {
			cook(i);
			Thread.sleep(50);
		}catch(InterruptedException e) {}
		
	}
}
//////////////////
}
