package sec04_p549_Files클래스를_이용한_파일속성조사;

import java.io.File;
import java.nio.file.Files;

public class Files1Demo {
	public static void main(String[] args) throws Exception {
		File f1 = new File("C:\\Temp\\org.txt");
		// File 클래스 new하여 생성함

		File f2 = new File("C:\\Temp");
		File f3 = new File("C:\\Temp\\ddd.txt");
		// File 클래스 new하여 생성함

		System.out.println("org.txt는 폴더? " + Files.isDirectory(f1.toPath()));
		// Path인터페이스 isDirectory는 폴더여부 확인하는것

		System.out.println("Temp는 폴더? " + Files.isDirectory(f2.toPath()));
		// Path인터페이스 isDirectory는 폴더여부 확인하는것

		System.out.println("org.txt는 읽을 수 있는 파일? " + Files.isReadable(f1.toPath()));
		// isReadable는 읽을수 있는 파일인지 여부 확인

		System.out.println("org.txt의 크기? " + Files.size(f1.toPath()));
		System.out.println("파일이 있는지? " + Files.exists(f1.toPath()));
//		Files.deleteIfExists(f3.toPath());
		 System.out.println("파일 생성 해줘 ddd.txt :"+Files.createFile(f3.toPath()));

	}
}
