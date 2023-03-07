package sec01;

public class _02Array2Demo {

	public static void main(String[] agrs) {
//		Scanner in = new Scanner(System.in);

		double[][] in = { { 3.2, 3.1, 3.2, 3.0 }, { 2.9, 2.8, 2.7, 2.6 }, { 2.7, 2.6, 2.5, 2.7 } };
		double[] sum1 = { 0.0, 0.0, 0.0 };
		double sum2 = 0.0;

		for (int i = 0; i < in.length; i++) {
			System.out.println("in.length->" + in.length);// 행의 개수
			// in.length : 행의개수
			// in[?].length : 열의 개수

			for (int j = 0; j < in[i].length; j++) {
				sum1[i] += in[i][j];
			}
			System.out.printf("%d차년도 평균 이자율= %.2f%%\n", i + 1, sum1[i] / 4.0);
			System.out.printf("%d차년도 평균 이자율= %.2f%%\n", i + 1, sum1[i] / in[0].length);
			sum2 += sum1[i];
		}

		System.out.printf("3년간 평균 이자율 =%.2f%%\n", sum2 / (3 * 4));
		System.out.printf("3년간 평균 이자율 =%.2f%%\n", sum2 / (in.length * in[0].length));

	}

}
