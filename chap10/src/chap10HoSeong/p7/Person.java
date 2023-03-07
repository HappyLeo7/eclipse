package chap10HoSeong.p7;

import java.util.Arrays;
import java.util.List;

//변수 생성
public class Person {
	String name;
	int cm;
	int kg;

	// 생성자
	public Person(String name, int cm, int kg) {

		this.name = name;
		this.cm = cm;
		this.kg = kg;
	}

	// 접근할수 있는 get 생성
	public String getName() {
		return name;
	}

	public int getCm() {
		return cm;
	}

	public int getKg() {
		return kg;
	}

	// 출력값 받을 수 있는 toString 생성
	public String toString() {
		return String.format("%s, %d, %d", name, cm, kg);
	}

	// 배열에 넣음
	public static final List<Person> persons = Arrays.asList(new Person("황진이", 160, 45), new Person("이순신", 180, 80),
			new Person("김삿갓", 175, 65), new Person("홍길동", 170, 68), new Person("배장화", 155, 48));
}
