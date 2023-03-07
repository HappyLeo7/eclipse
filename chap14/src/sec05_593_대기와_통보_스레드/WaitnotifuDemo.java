package sec05_593_대기와_통보_스레드;

public class WaitnotifuDemo {
	public static void main(String[] args) {
		TotalThread t = new TotalThread();
		t.start();

		synchronized (t) {
			try {
				System.out.println("스레드 t가 끝날 때까지 대기...");
				t.wait();//작업 스레드에서 통보가 올때까지 메인 스레드가 대기한다.
			
			} catch (InterruptedException e) {

			}
		}
		System.out.println("총합 : " + t.total); // 메인 스레드가 Total객체를 직접사용
	}
}
