package exx07;

import java.text.MessageFormat;

public class MessageFormatTest {
	public static void main(String[] args) {
		Object[][] data = { { "세종대왕", 1, "조선" }, { "오바마", 2, "미국" }, { "징기스칸", 3, "몽고" } };

		// MessageFormat 클래스를 이용하는 코드

//		MessageFormat f = new MessageFormat("이름 : {0}\t번호 : {1}\t국적 : {2}");
//		System.out.println(f.format(data));
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++)
				if (j == 0) {
					System.out.print(MessageFormat.format("이름:{0} \t", data[i][j]));
				} else if (j == 1) {
					System.out.print(MessageFormat.format("번호:{0} \t", data[i][j]));
				} else if (j == 2) {
					System.out.print(MessageFormat.format("국적:{0}\n", data[i][j]));
				}
		}
		// for (int i = 0; i < 3; i++) {
//			int j = 0;
//			System.out.println(
//					MessageFormat.format
//					("이름:{0} \t 번호:{1} \t 국적:{2}\n", data[i][j], data[i][j + 1], data[i][j + 2]));
//			j++;
//		}
	}
}
