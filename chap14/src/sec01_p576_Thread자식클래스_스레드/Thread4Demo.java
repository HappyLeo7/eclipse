package sec01_p576_Thread자식클래스_스레드;

public class Thread4Demo {
public static void main(String[] args) {
	Thread t = new WorkerThread();
	t.start();
	
	for(int i=0;i<5;i++) {
		System.out.print("안녕 ");
		
		try {
			Thread.sleep(500);
		}catch(InterruptedException e) {}
		
	}
}
}
