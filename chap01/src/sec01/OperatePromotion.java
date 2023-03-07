package sec01;

public class OperatePromotion {

	public static void main(String[] args) {

		short num1 = 11;
		short num2 = 22;
		short result = (short) (num1 + num2);
		int result2 = num1 + num2;
		System.out.println(result);
		System.out.println(result2);

		int fifteen = 15;
		byte fifteen1 = 0b1111;
		short fifteen2 = 017;
		int fifteen3 = 0xF;
		long lightSpeed = 300000L;

		System.out.println("[int fifteen = 15;]는 int로 fifteen을 10진수로 15 할당 : " + fifteen);
		System.out.println("[byte fifteen1 = 0b1111;]는 byte로 fifteen1을 2진수로 0b1111 할당 : " + fifteen1);
		System.out.println("[short fifteen2 = 017;]는 short로 fifteen2를 8진수로 017 할당 : " + fifteen2);
		System.out.println("[int fifteen3 = 0xF;]는 int로 fifteen3을 16진수로 0xF 할당 : " + fifteen3);
		System.out.println("[long lightSpeed = 300000L;]는 'L'로 long 타입임을 명시 :" + lightSpeed);

	}

}
