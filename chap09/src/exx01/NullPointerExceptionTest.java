package exx01;

public class NullPointerExceptionTest {
	public static void main(String[] args) {
		
		//try 만들어서 null을 잡아라 
		
		
		MyDate d = new MyDate(2035, 12, 25);
		System.out.printf("%d년 %d월 %d일 \n", d.year, d.month, d.day);
	}
}
