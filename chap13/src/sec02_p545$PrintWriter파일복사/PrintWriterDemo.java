package sec02_p545$PrintWriter파일복사;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
public static void main(String[] args) {
	try(BufferedReader br = new BufferedReader( // BufferedReader 보조 스트림 사용시  
			new FileReader("C:\\Temp\\org.txt")); // FileReader 기반 스트림을 사용해야한다.
			
			PrintWriter pr = new PrintWriter(
					new FileWriter("C:\\Temp\\dup.txt"));){
		
		br.lines().forEach(x->pr.println(x));
	}catch(IOException e) {
		
	}
				
}
}
