package sec04_p551_Files_클래스로_스트림_사용1;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Stream;

public class Stream1Demo {
public static void main(String[] args) {
	File file=new File("C:\\Windows");
	File[] fs=file.listFiles();
	
	Stream<File> stream=Arrays.stream(fs);
	long count=stream.filter(x->x.isDirectory()==false).count();
	System.out.println("C:\\Windows에 있는 파일 개수 :"+count);



	
	Stream<File> dd=Arrays.stream(fs);
	long dd1=dd.filter(x->x.isDirectory()==true).count();
	System.out.println("C:\\Windows에 있는 디렉토리 개수 :"+dd1);
}
}
