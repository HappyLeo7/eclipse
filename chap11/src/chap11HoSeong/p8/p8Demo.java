package chap11HoSeong.p8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class p8Demo {

	public static void main(String[] args) {

		String[] s = { "독수리", "고양이", "강아지" }; // p461에 있는 Collections 메서드를 참조하여 품

		List<String> list = Collections.nCopies(2, "개미");

		System.out.println(list);

		List<String> al1 = new ArrayList<>(list);
		System.out.println("nCopies : " + al1);

		Collections.fill(al1, "벌");
//		al1.replaceAll(x -> "벌");
		System.out.println("벌을 채운 후 : " + al1);

		Collections.addAll(al1, s);
		System.out.println("리스트에 모두 추가한 후 : " + al1);

		Collections.shuffle(al1);
		System.out.println("리스트를 섞은 후 " + al1);

		Collections.reverse(al1);
		System.out.println("리스트를 역순으로 정렬한 후 : " + al1);

		System.out.println("리스트에서 최소 : " + Collections.min(al1));
		System.out.println("리스트에서 최대 : " + Collections.max(al1));
		System.out.println("리스트에서 벌의 빈도 : " + Collections.frequency(al1, "벌"));
	}
}
