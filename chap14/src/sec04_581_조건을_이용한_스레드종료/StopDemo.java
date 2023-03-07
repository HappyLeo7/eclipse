package sec04_581_조건을_이용한_스레드종료;

public class StopDemo {
public static void main(String[] args) {
	StopThred t =new StopThred();
	t.start();
	
	
	try {
		Thread.sleep(3);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	t.stop=true;
}
}
