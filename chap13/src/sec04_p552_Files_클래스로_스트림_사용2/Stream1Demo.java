package sec04_p552_Files_클래스로_스트림_사용2;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class Stream1Demo {
	public static void main(String[] args) throws Exception {
		String[] number = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
		Path p = new File("C:\\Temp\\number.txt").toPath(); // number.txt 파일을 생성해야한다.
		Stream<String> s = Files.lines(p);
		s.forEach(x -> System.out.println(x));
		s = Files.lines(p);

		s.map(x -> number[Integer.parseInt(x)]).forEach(x -> System.out.println(x + " "));
	}
}
