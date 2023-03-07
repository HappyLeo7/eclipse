package sec03_578_스레드_풀의_활용_ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
	public static void main(String[] args) {
		// run을 가지고 있는 인터페이스사용
		Runnable task = () -> {

			// 반복 5번
			for (int i = 0; i < 5; i++) {
				// 출력물
				System.out.println("잘가, ");

				// 슬립
				try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};

//		ExecutorService exec = Executors.newCachedThreadPool(); // 디폴트는 1개의 스레드를 만들겠다
ExecutorService exec = Executors.newFixedThreadPool(4); // 스레드를 4개를 생성하겠다.
		exec.execute(task); //실행코드 
//exec.submit(task); //요청하는 실행코드

//반복
		for (int i = 0; i < 5; i++) {
//출력물
			System.out.println("안녕, ");
			try {
				Thread.sleep(340);
			} catch (InterruptedException e) {
			}
		}
		exec.shutdown(); //호출하지않으면 종료되지않는다.
	}
///////////
}
