package sec05_593_대기와_통보_스레드;

public class TotalThread extends Thread {
	int total;

	public void run() {
		synchronized (this) {
			for (int i = 1; i <= 100; i++) {
				total += i;
				notify(); // 작업을 종료하면 대기중인 스레드에 통보한다.
			}
		}
	}
}
