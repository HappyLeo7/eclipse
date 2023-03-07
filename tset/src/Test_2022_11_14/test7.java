package Test_2022_11_14;

public class test7 {
	public static void main(String[] args) {

		//n1 : 눈1
		//n2 : 눈2
		
		while (true) {
			int n1 = (int) (Math.random() * 6) + 1;
			int n2 = (int) (Math.random() * 6) + 1;
			System.out.println("n1 : " + n1);
			System.out.println("n2 : " + n2);
			System.out.println();
			if (n1 + n2 == 6) {
				break;
			}

		}
	}
}
