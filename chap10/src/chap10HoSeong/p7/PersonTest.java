package chap10HoSeong.p7;

import java.util.List;
import java.util.function.ToIntFunction;

public class PersonTest {

	public static void main(String[] args) {

		// 람다식
		double averageCm = average(Person.persons, c -> c.getCm());
		double averageKg = average(Person.persons, c -> c.getKg());

		System.out.println("평균 신장 : " + averageCm);
		System.out.println("평균 체중 : " + averageKg);
	}

	// 각 값을 더한 후 나누기 size로 평균을 구함
	static double average(List<Person> list, ToIntFunction<Person> p) {
		double sum = 0;

		for (Person per : list)
			sum += p.applyAsInt(per);

		return sum / list.size();
	}
}
