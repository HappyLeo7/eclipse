package chap11HoSeong.p2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class PersonTest {

	public static void main(String[] args) {

		Set<Person> set = new HashSet<>(); // set에 Person타입으로 값과 벨류 넣음
		set.add(new Person("김열공", 20));
		set.add(new Person("최고봉", 56));
		set.add(new Person("우등생", 16));
		set.add(new Person("나자바", 35));

		// 람다식으로 forEach 출력인데 값과 벨류 사이에 : 를 넣음
		set.forEach((a) -> System.out.println(a.name + " : " + a.age));

		System.out.println();

		// while을 이용하여 iterator(반복자쓰기위해 새로 넣음 p438) 값이 떨어질때까지 값 출력(toString 리턴값으로 출력되게)
		Iterator<Person> iterator = set.iterator();
		while (iterator.hasNext())
			System.out.print(iterator.next());

	}

}
