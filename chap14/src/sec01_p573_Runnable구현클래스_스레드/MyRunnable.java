package sec01_p573_Runnable구현클래스_스레드;

public class MyRunnable implements Runnable {
	//run 매서드 생성 
	public void run() {
		//5번 반복문
		for (int i = 0; i < 5; i++) {
			System.out.print("잘가. ");
			
			//슬로우를 건다.
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

			}
		}
	}
}
