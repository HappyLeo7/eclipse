package sec04_p555_FileChannel클래스_파일복사;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class Channel1Demo {
public static void main(String[] args) throws IOException {
//	FileInputStream fis=new FileInputStream("C:\\Temp\\org.txt");
	FileInputStream fis=new FileInputStream("C:\\Temp\\new.txt");
//	Path path=Paths.get("C:\\Temp\\dup.txt");
	Path path=Paths.get("C:\\Temp\\dup"+(int)(Math.random()*9)+".txt");
	
	FileChannel org=fis.getChannel();
	
	FileChannel dup=FileChannel.open(path,
			StandardOpenOption.WRITE,
			StandardOpenOption.CREATE);
	
	ByteBuffer buf = ByteBuffer.allocate(10);
	
	while(org.read(buf)!=-1) { //덮어쓴다.
		System.out.println(buf.flip()); //buf.flip()
		dup.write(buf);
		buf.clear(); //클리어를 안해주면 안끝나고 무한으로 복사시켜줌
	}
	org.close();
	dup.close();
	
}
}
