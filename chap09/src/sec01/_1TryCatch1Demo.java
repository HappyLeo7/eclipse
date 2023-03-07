package sec01;

public class _1TryCatch1Demo {
	public static void main(String[] args) {
		int[] array = { 0, 1, 2 };
		try {
			System.out.println("마지막 원소 => " + array[3]);
			System.out.println("첫 번째 원소 => " + array[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
//		} catch (부모이름가능 e) {
			System.out.println("원소가 존재하지 않습니다.");
		} finally {
			System.out.println("finally: ");
		}
		System.out.println("어이쿠!!!");
	}
}
