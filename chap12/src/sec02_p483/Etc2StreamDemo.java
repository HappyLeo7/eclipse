package sec02_p483;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Etc2StreamDemo {
	public static void main(String[] args) {

		// 람다식구조 첫원소가 1이므로 다음 원소들은 3 5 7 등으로 생성된다.
		IntStream is1 = IntStream.iterate(1, x -> x + 2);

		// 0~10 사이의 정수인 난수를 생성한다.
		IntStream is2 = new Random().ints(0, 10);

		// Math의 random()로 Stream<Double>을 생성한다.
		Stream<Double> ds = Stream.generate(Math::random);

		// 정수 1,2,3,4 까지 생성한다.
		IntStream is3 = IntStream.range(1, 5);

		// 출력방법
		is3.forEach(x -> System.out.print(x + " "));
	}
}
