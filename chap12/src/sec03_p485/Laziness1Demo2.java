package sec03_p485;

import java.util.stream.IntStream;

public class Laziness1Demo2 {
	public static void main(String[] args) {
		IntStream is = IntStream.rangeClosed(1, 5);
////////////////////////////////////////////////////////////////////////////
		is.filter(x -> {
			System.out.println("filter : " + x);
			return x % 2 == 0;// 2의 배수만 출력

		}).map(x -> {
			System.out.println("map : " + x);
			return x * x; // 제곱 출력
			
		}).forEach(x -> System.out.println("forEach : " + x));
		
		//1 ~ 5 까지 순서대로 들어온다
///////////////////////////////////////////////////////////////////////////
	}
}
