package sec03_p415;

import java.util.function.Function;
import java.util.function.IntToDoubleFunction;
import java.util.function.ToDoubleBiFunction;

public class Function1Demo {
	public static void main(String[] args) {

		// Function< T , U > 인터페이스
		Function<Integer, Integer> add2 = x -> x + 2;
		Function<Integer, Integer> mul2 = x -> x * 2;

		System.out.println(add2.apply(3));
		System.out.println(mul2.apply(3));

		System.out.println(add2.andThen(mul2).apply(3));
		System.out.println(add2.andThen(mul2).apply(2));
		System.out.println(add2.andThen(mul2).apply(10));
		System.out.println(add2.compose(mul2).apply(3));
		System.out.println(add2.compose(mul2).apply(10));

		// IntToDoubleFunction 인터페이스
		IntToDoubleFunction halFunction = x -> x / 2.0;
		System.out.println(halFunction.applyAsDouble(5));

		// ToDoubleBiFunction< T , U > 인터페이스
		ToDoubleBiFunction<String, Integer> circleArea = (s, i) -> Double.parseDouble(s) * i * i;
		double area = circleArea.applyAsDouble("3.14", 5);
		System.out.println(area);
	}
}
