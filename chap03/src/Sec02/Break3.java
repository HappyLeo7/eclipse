package Sec02;

public class Break3 {

	public static void main(String[] args) {

		int num = 1;
		int search = 0;
//		int count = 0;

		while (num < 1000) {

			if (((num % 5) == 0) && ((num % 7) == 0)) {
				search++;
				System.out.printf("5의 배수이고 7의 배수인 정수 %d\n", num);

				if (search > 4) {
					break;
				}
//					while (count < 8) {
//						count++;
//						System.out.printf("%d,%d\n", num, count);
//
////						if ((count <= 8)) {
////							System.out.println(count);
//
//						break;
			}
			num++;
//					search = true;

//break;

		}
		System.out.println("while문의 반복횟수 =>" + num);
	}

}
