package sec04_581_조건을_이용한_스레드종료;

public class StopThred extends Thread{//상속
//필드
	public boolean stop;
	
	public void run() {
		
		//while 반복문을 이용해 종료 
		while(!stop) {
			System.out.println("실행 중...");
			try {
				Thread.sleep(0);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
System.out.println("정상 종료");
}
	/////////
}
