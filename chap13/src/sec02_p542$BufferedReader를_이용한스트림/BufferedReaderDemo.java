package sec02_p542$BufferedReader를_이용한스트림;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {
	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(
				new FileReader("C:\\Temp\\org.txt"));){
			
			br.lines().forEach(s->System.out.println(s));
		}catch(IOException e) {
			
		}
	}
	
	
	
	
	
}
