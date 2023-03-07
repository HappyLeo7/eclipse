package sec01_p577_Thread의_익명_자식_객체_스레드;

public class Thread5Demo {
public static void main(String[] args) {
	//간략히 new Thread하기
	//Thread t = new WorkerThread();
	//t.start();
	
	//new Thread {} 안에 run매서드를 사용하여 출력물"잘가"와 for을 이용한 반복을하고 예외처리로 Thread.sleep을 사용하여 딜레이 500을 걸어준다. 마지막으로 new Thread(){}.start해준다
	new Thread() {
		public void run() {
			for(int i=0;i<5;i++) {
				System.out.print("잘가, ");
				try {
					Thread.sleep(500);
				} catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}.start();
	
	for(int i=0;i<5;i++) {
	System.out.print("안녕, ");
	try {
		Thread.sleep(500);
	}catch(Exception e) {
		
	}
	}
}
}
