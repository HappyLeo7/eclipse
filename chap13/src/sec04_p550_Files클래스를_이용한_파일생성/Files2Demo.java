package sec04_p550_Files클래스를_이용한_파일생성;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Files2Demo {
public static void main(String[] args) throws Exception{
	Charset cs=Charset.defaultCharset();
	Path p=new File("C:\\Temp\\new.txt").toPath();
	
	if(Files.notExists(p)) {
		Files.createFile(p);
	}
	
	byte[] data="좋은 아침!\n잘 가세요.!\n".getBytes();
	Files.write(p,data,StandardOpenOption.APPEND);
	//Files.write(경로 , 데이터 내용 , 뒤에 붙여줘)
	
	try {
		List<String>lines=Files.readAllLines(p,cs);
		for(String line:lines)
			System.out.println(line);
	} catch (IOException e) {
	}
	
	
	System.out.println(Files.size(p));
}
}
