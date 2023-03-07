package sec03_직렬화;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectOutput {
	public static void main(String[] args) {
		SBox box1 = new SBox("감사","1234");
		SBox box2 = new SBox("행복","45123");

		try (ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream("Object.bin"))) { // 기반스트림
																									// FileOutputStream
																									// 필요
			o.writeObject(box1);
			o.writeObject(box2);

		} catch (IOException e) {
			e.printStackTrace(); // 자동으로 catch해달라는 의미 ?
		}
	}
}
