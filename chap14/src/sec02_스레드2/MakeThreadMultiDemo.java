package sec02_스레드2;

public class MakeThreadMultiDemo {
public static void main(String[] args) {
	Runnable // 인터페이스 Runnable 
	t1=()->{
		for(int i=0;i<20;i++) {
		if(i%2==0) {
			System.out.print(i+" ");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		}
	};
	Runnable
	t2=()->{
		for(int i=0;i<20;i++) {
			if(i%2==1) {
				System.out.print(i+" ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	
//	tt1.start();
	Thread tt1 =new Thread(t1 );
	(new Thread(t1)).start();
	Thread tt2 =new Thread(t2);
	tt2.start();
	
}
}
