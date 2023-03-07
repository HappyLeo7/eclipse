package sec02_p543$InputStreamReader의_활용;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class StreamReaderDemo {
public static void main(String[] args) {
	String input="C:\\Temp\\org.txt";
	
	try(FileInputStream fi = new FileInputStream(input);
			InputStreamReader in = new InputStreamReader(fi,"UTF-8")){  //캐릭터셋을 InpitStreamReader(갈호 안에 줄수있다.)
//		InputStreamReader in = new InputStreamReader(fi,"US-ASCII")){
		int c;
		
		System.out.println(in.getEncoding());
		while((c=in.read())!=-1)
			System.out.print((char)c);
	}catch (IOException e) {
		
	}
}
}
