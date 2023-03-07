package sec03_578_스레드_풀의_활용_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
public static void main(String[] args) {
	//람다식을 이용한 스레드화하고
	Runnable t = ()->{
		int n1=10;
		int n2=20;
		String name=
				Thread.currentThread().getName();//출력값 : Thread-0
		System.out.println(name+ " : "+(n1+n2));
	};
	//아래에 스레드 t를 thread에 new해준다
//	Thread thread=new Thread(t);
	//매개변수스레드.start
//	thread.start();
	
	ExecutorService tt = Executors.newSingleThreadExecutor();
//	tt.execute(t);
	tt.submit(t);

	System.out.println("End "+
			Thread.currentThread().getName() // 출력값 : main
			);
	
	tt.shutdown();
}
}
