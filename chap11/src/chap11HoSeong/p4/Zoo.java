package chap11HoSeong.p4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zoo {

	public static void main(String[] args) {

		Set<String> a1 = new HashSet<>(); // set 생성
		a1.addAll(Arrays.asList("독수리", "나비", "염소", "고양이", "개미", "여우")); // 값 넣음
		System.out.println("hashset" + a1);

		TreeSet<String> a2 = new TreeSet<>(a1); // treeset생성
		System.out.println("TreeSet" + a2);
		System.out.println("첫 번째 동물 : " + a2.first()); // first로 첫번째 출력
		System.out.println("마지막 동물 : " + a2.last()); // last로 마지막 출력
		System.out.println("나비 앞에 있는 동물 : " + a2.lower("나비")); // lower("나비")로 나비 앞에있는 동물 출력
	}

}
