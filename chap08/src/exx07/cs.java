package exx07;

import java.text.MessageFormat;

public class cs {
	public static void main(String[] args) {
		// 오브젝트 타입으로 date 2차원 배열 넣음
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

//		System.out.println("번호 \t 이름 \t 국적");

		MessageFormat message1 = new MessageFormat(" {1}\t{0}\t {2}");
		String[] s = { "이름", "번호", "국적" };
		System.out.println("--------------------");
		System.out.println(message1.format(s));
		for (int i = 0; i < data.length; i++) {
			System.out.println(message1.format(data[i])); // data[i] 는 2차배열에서 행만 가지고오는 주소 값이다.

		}
//		System.out.println(message.format(data[1]));
//		System.out.println(data[2]);
//		System.out.println(data[1]);
	}
}
