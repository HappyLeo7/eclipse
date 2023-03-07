package exam;

public class Ex2_08_PrintTest {

	public static void main(String[] agrs) {
		Ex2_08_Sklass s = new Ex2_08_Sklass();
		new Ex2_08_Sklass();
		new Ex2_08_Sklass();
//		System.out.printf("%d", s.i);
		Ex2_08_Oklass o = new Ex2_08_Oklass();
		new Ex2_08_Oklass();
		new Ex2_08_Oklass();
//		System.out.printf("%d", o.i);
		System.out.printf("%d,%d", s.i, o.i);

	}
}
