package sec04_583_조건을_이용한_스레드종료;

public class Interrupt1Demo {
public static void main(String[] args) {
	Runnable 
	task=()->{
		//반복문
			try {
				while(true) {
					System.out.println("실행 중....");
					Thread.sleep(1);
			} 
			}catch (InterruptedException e) {
			}
			System.out.println("정상 종료");
		
	};
	
	Thread t=new Thread(task);
	t.start();
	
	try {
		Thread.sleep(3);
	} catch (InterruptedException e) {
	}
	t.interrupt(); // 메인 스레드가 인터럽트를 요청한다
}
}
