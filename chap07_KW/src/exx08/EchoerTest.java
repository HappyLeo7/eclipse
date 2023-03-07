package exx08;

import java.util.Scanner;

public class EchoerTest {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/////////////////////////////////////////////
		Echoer e = new Echoer() { // 익명 클래스

			@Override
			void echo() {
				String echo = "";
				while (!echo.equals("끝")) {
					echo = in.nextLine();
					System.out.println(echo);
				}

			}

		};
/////////////////////////////////////////////////////
		e.start();
		e.echo();
		e.stop();

		in.close(); // 스케너 잡는거
	}
}
