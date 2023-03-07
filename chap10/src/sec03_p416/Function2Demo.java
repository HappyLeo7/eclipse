package sec03_p416;

import java.util.List;
import java.util.function.Function;
import java.util.function.ToIntFunction;

import sec03_p405.Car;

public class Function2Demo {
	public static void main(String[] args) {
		Function<Car, String> f1 = c -> c.getModel();
		ToIntFunction<Car> f2 = c -> c.getAge();

		// 반복문
		for (Car car : Car.cars) {
			System.out.print("(" + f1.apply(car) + ", " + f2.applyAsInt(car) + ") ");
		}
		System.out.println();

		double averageAge = average(Car.cars, c -> c.getAge());
		double averageMileage = average(Car.cars, c -> c.getMileage());

		System.out.println("평균 연식 = " + averageAge);
		System.out.println("평균 주행거리 = " + averageMileage);

	}

	static public double average(List<Car> cars, ToIntFunction<Car> f) {// static 을 통해서 average매서드를 new하지 않아도된다.
		double sum = 0.0;

		for (Car car : cars) {
			sum += f.applyAsInt(car);

		}
		return sum / cars.size();
	}
}
