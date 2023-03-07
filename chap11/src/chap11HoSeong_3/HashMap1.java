package chap11HoSeong_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {

		// 키와 벨류 생성
		Map<String, String> dic = new HashMap<>();
		dic.put("head", "대가빠리");
		dic.put("teacher", "쌤");
		dic.put("cat", "꼬네이");
		dic.put("aunt", "아지매");
		dic.put("noodle", "국시");
		dic.put("child", "얼라");

		// 키와 벨류값 사이에 = 표시 넣어서 출력
		dic.forEach((k, n) -> System.out.print(k + "=" + n + " "));
		System.out.println();
		// 벨류값만 따로 빼서 collection1에 넣음
		Collection<String> collection1 = dic.values();
		// List타입의 list에 삽입
		List<String> list = new ArrayList<>(collection1);
		// 셔플로 섞기
		Collections.shuffle(list);
		list.forEach(x -> System.out.print(x + "  "));

	}

}
