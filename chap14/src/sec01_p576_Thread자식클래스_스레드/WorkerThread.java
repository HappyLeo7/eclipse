package sec01_p576_Thread자식클래스_스레드;

public class WorkerThread extends Thread{//자식 상속
//매서드
	public void run() {
		
		//반복문 5회
		for (int i=0; i<5; i++) {
		
			//반복하고자하는 매서드 출력물
		System.out.print("잘가 ");
		
		//예외처리
		try {
		
			//Thread.슬립
			Thread.sleep(500);
		}catch(InterruptedException e) {}
		}
		}
	///////////////
}


