package sec01;

public class CheckedDemo {
	public static void main(String[] args) {
//		Thread.sleep(100);

		try {
			Thread.sleep(100);
		} catch (InterruptedException e) { // 예외처리
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//////////////////////////////////////////
	}
}
