package chap11HoSeong.p7;

import java.util.Collections;
import java.util.HashSet;

public class P7Demo {

	public static void main(String[] args) {

		String[] s1 = { "a", "b", "a", "b", "c" };
		String[] s2 = { "c" };

		HashSet<String> set1 = new HashSet<>();
		HashSet<String> set2 = new HashSet<>();

		Collections.addAll(set1, s1);
		Collections.addAll(set2, s2);

		System.out.println("set1 : " + set1); // HashSet은 중복이 안되므로 abc만나옴
		System.out.println("set2 : " + set2); // c밖에 없어서 c가 나옴

		System.out.println("set1과 set2는 같다 : " + set1.equals(set2)); // equals로 값 비교
		System.out.println("set1은 set2의 모든 원소를 포함한다 : " + set1.containsAll(set2)); // containsAll로 set2가 set1에 포함되는지

		HashSet<String> sum = new HashSet<>();
		sum.addAll(set1); // sum을 만들어 두개 다 추가함(중복이 안되므로 합집합이 나옴
		sum.addAll(set2);
		System.out.println("합집합 : " + sum);
		set1.retainAll(set2); // retainAll로 set1안에서 set2에 속하는것만 출력
		System.out.println("교집합 : " + set1);
	}

}
