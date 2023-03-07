package sec07;

public class _03OneToTenDemo {
	static int sumOneToTen;

	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++)
//			sum = sum + i;
			sum += i;
		sumOneToTen = sum;
	}

	public static void main(String[] args) {
		System.out.println(sumOneToTen);
	}

	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++)
//			sum = sum + i;
			sum += i;
		sumOneToTen = sum;
		System.out.println(sumOneToTen);
	}

}
