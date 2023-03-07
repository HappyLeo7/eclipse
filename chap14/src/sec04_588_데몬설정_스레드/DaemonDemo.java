package sec04_588_데몬설정_스레드;

public class DaemonDemo {
public static void main(String[] args) {
	
	//람다식 Runnable 인터페이스
	Runnable task=()->{
		//반복
		for(int i =0;i<3;i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			System.out.println(Thread.currentThread().getName());
		}
		System.out.println("작업 끝");
	};
	Thread t1=new Thread(task,"작업 스레드");
	t1.setDaemon(true); //데몬스레드 설정
	t1.start();
	
	try {
		Thread.sleep(1);
	} catch (InterruptedException e) {
	}
	System.out.println("메인 스레드가 끝났습니다.");
}
}
