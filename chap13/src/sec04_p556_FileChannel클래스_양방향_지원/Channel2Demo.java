package sec04_p556_FileChannel클래스_양방향_지원;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Channel2Demo {
	public static void main(String[] args) throws IOException {
		Path p = Paths.get("C:\\Temp\\data.txt");//Path 클래스를 통해 불러올 파일 만들기
		FileChannel fc = FileChannel.open(p, //FileChannel 클래스 사용
				StandardOpenOption.READ,     //
				StandardOpenOption.CREATE,
				StandardOpenOption.WRITE);

		ByteBuffer buf = ByteBuffer.allocate(1024);
		String s = "유유상종.\n Birds of a feather flock together.\n"
		+ "시간은 금이다.\n Time is money.";

		System.out.println(buf.put(s.getBytes()));
//		buf.put(s.getBytes());

		System.out.println(buf.flip());
//		buf.flip();
		
		int count = fc.write(buf); // fc 채널에 카운트해준다 
		
		
		System.out.println("C:\\Temp\\data.txt에 " + count + "바이트 기록");

		buf.clear();
		fc.read(buf); //읽는다.

		System.out.println(new String(buf.array()));

		fc.close();
	}
}
