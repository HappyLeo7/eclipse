package sec01;

public class _1TryCatch2Demo {
	public static void main(String[] args) {
		int did = 10;

		try {
			int dis = Integer.parseInt(args[0]);
			System.out.println(did / dis);
//아래와같이처리하면 하단에 있는 예외처리로들어가질 못한다.
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//////////////////////////////////////////////
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다");
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
			System.out.println(e.getMessage());
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());
		} finally {
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("종룡");

	}
}
