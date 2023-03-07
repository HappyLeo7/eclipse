package sec04_584_Join메서드;

public class JoinThread extends Thread {
//필드
	int total;

	// 매서드
	public void run() {
		for (int i = 1; i <= 100; i++)
			total =total+i;
	}
}
