package Sec02;

public class Break2 {

	public static void main(String[] args) {

		int num = 1;
//		boolean search = false;
		int count = 0;

		while (num < 1000) {

			{
				if (((num % 5) == 0) && ((num % 7) == 0)) {
					while (count < 5) {
						count++;
						System.out.printf("5의 배수이고 7의 배수인 정수 :%d\n", num);

//						if ((count <= 8)) {
//							System.out.println(count);

						break;
					}
//					search = true;

				}

//break;

			}
			num++;
		}
		System.out.println("while문의 반복횟수 =>" + num);

//		if (search)

		{
//			System.out.println("5와7의배수 : " + num);
//			System.out.println(count);
//		} else {
//			System.out.println("5와7의 배수가 아니다");
		}
	}

}
