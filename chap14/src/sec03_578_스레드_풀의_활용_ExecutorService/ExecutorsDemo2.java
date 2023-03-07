package sec03_578_스레드_풀의_활용_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo2 {
public static void main(String[] args) {
	Runnable // 인터페이스 Runnable 
	t1=()->{
		String name = Thread.currentThread().getName();// pool과 Thread을 알려준다.
		for(int i=0;i<20;i++) {
		if(i%2==0) {
			System.out.println(name+" : "+i+" ");
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
		String name = Thread.currentThread().getName();
		for(int i=0;i<20;i++) {
			if(i%2==1) {
				System.out.println(name+" : "+i+" ");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	};
	
	ExecutorService se = Executors.newFixedThreadPool(4);
	se.submit(t1);
	se.submit(t2);
	se.submit(()->{
	String name = Thread.currentThread().getName();
	System.out.println(name+" "+(33+33));
	});
	se.shutdown();
	
	
	
	
	
	
	
	
	
	
//	tt1.start();
//	Thread tt1 =new Thread(t1 );
//	(new Thread(t1)).start();
//	Thread tt2 =new Thread(t2);
//	tt2.start();
	
}
}
