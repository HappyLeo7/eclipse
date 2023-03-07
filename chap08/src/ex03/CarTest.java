package ex03;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class CarTest {
	public static void main(String[] args) {
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");
//////////////////////////////
		if (myCar.equals(yourCar)) {

			System.out.println("내 자동차는 [" + myCar.toString() + "], 너 자동차는 [" + yourCar.toString() + "]로 모델이 같다.");
		} else {
			System.out.println("내 자동차는 [" + myCar + "], 너 자동차는 [" + yourCar + "]로 모델이 다르다.");

		}
////////////////////////////
		// 날짜
		Date now = new Date(); // 현재 날짜를 now 로 삽입

		SimpleDateFormat today = new SimpleDateFormat("dd-MM-yyyy");
		System.out.print("날짜 : " + today.format(now) + ", ");
		// MessageFormat을 활용한 모델과 운전자 출력
		String a = "그랜저";
		String b = "홍길동";
		String s = MessageFormat.format("자동차 모델=[{0}], 운전자({1})", a, b);

		System.out.println(s);

//////////////////////////////////
		String zz = ("날짜: " + today.format(now) + " 자동차 모델 그랜저 운전자 홍길동");
		StringTokenizer z = new StringTokenizer(zz, " ,");

//while을 사용하여서 반복 출력
		while (z.hasMoreTokens()) {
			System.out.println(z.nextToken());
		}

	}
}
