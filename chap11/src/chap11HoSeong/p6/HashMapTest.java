package chap11HoSeong.p6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		Map<String, String> zoo = Map.of("호랑이", "tiger", "표범", "leopard", "사자", "lion");

		Map<String, String> lists = new HashMap<>(zoo);
		System.out.println("변경 전 : " + lists);

		System.out.print("변경 후 : {");
		lists.replaceAll((x, y) -> y.toUpperCase()); // 람다식 이용해서 toUpperCase로 벨류값만 따로 대문자로 변경함

		System.out.println(lists);
	}

}
