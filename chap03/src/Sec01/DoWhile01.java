package Sec01;

public class DoWhile01 {

	public static void main(String[] args) {

		int i = 4;
		do {
			i++;
		} while (i < 5);
		System.out.println("do~while 문 실행 후 : " + i);

		i = 4;
		while (i < 5) {
			i++;
		}
		System.out.println("While 문 실행 후 : " + i);
	}

}
