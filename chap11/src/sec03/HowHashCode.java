package sec03;

import java.util.HashSet;

public class HowHashCode {
	public static void main(String[] args) {
		HashSet<Car> cset = new HashSet<>();
		cset.add(new Car("HY_MD_301", "RED")); // 기준 301 과 레드
		cset.add(new Car("HY_MD_305", "BLACK"));
		cset.add(new Car("HY_MD_305", "WHITE"));
		cset.add(new Car("HY_MD_305", "GREEN"));
		cset.add(new Car("HY_MD_30", "RED"));
		cset.add(new Car("HY_MD_30", "RED"));
		cset.add(new Car("HY_MD_305", "BLACK"));
		cset.add(new Car("HY_MD_305", "WHITE"));
		cset.add(new Car("HY_MD_305", "GREEN"));
		cset.add(new Car("HY_MD_05", "RED"));
		System.out.println("인스턴스의 수 : " + cset.size());

		// 반복문을 통하여 배열을 한다.
		for (Car c : cset) {
			System.out.println(c);
		}
	}
}
