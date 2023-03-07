package sec01_p573_Runnable구현클래스_스레드;

public class Thread1Demo {
	public static void main(String[] args) {
//		Thread t = new Thread(new MyRunnable());
//		t.start();
//
//		for (int i = 0; i < 5; i++) {
//			System.out.print("안녕. ");
//
//			try {
//				Thread.sleep(500);
//			} catch (InterruptedException e) {
//			}
//		}

		//간략히 한문장으로 만든 스레드
		new Thread(new Runnable() {

			@Override
			public void run() {
				for(int i = 0; i<5;i++) {
				System.out.println("잘가. ");
				try {
					Thread.sleep(500);
				}catch(InterruptedException e) {
					
				}
			}}
			
		}).start();
		
		
		//람다식 Thread
		new Thread(()->{
		for(int i=0;i<5;i++){
			System.out.println("안녕. ");
		try {
		Thread.sleep(500);	
		}catch(InterruptedException e) {
			
		}
			
		}}).start();
		
	}
}
