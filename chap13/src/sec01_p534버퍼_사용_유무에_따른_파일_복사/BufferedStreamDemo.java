package sec01_p534버퍼_사용_유무에_따른_파일_복사;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamDemo {
	public static void main(String[] args) {
		long start, end, duration; // 필드선언
		String org = "C:\\Program Files (x86)\\Internet Explorer\\iexplore.exe";
		String dst = "C:\\Temp\\iexplore1.exe";

		start = System.nanoTime();

		// 예외처리
		try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream(org));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dst));) {
			while (bis.available() > 0) {
				int b = bis.read();
				bos.write(b);
			}
			bos.flush(); // 데이터가 남아 있을수있으니 flush 해주어야한다.
		} catch (IOException e) {

		}

		end = System.nanoTime();
		duration = end - start;
		System.out.println("버퍼를 사용한 경우 : " + duration);

		start = System.nanoTime();
		try (FileInputStream fis = new FileInputStream(org); FileOutputStream fos = new FileOutputStream(dst);) {
			while (fis.available() > 0) {
				int b = fis.read();
				fos.write(b);
			}
//		fos.flush()
		} catch (IOException e) {

		}
		end = System.nanoTime();
		duration = end - start;
		System.out.println("버퍼를 사용하지 않은 경우 : " + duration);

	}
}
