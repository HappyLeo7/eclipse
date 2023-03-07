package sec04_p488;

import java.util.stream.IntStream;

public class ParallelDemo {
public static void main(String[] args) {
//필드 선언
	long start,end,total;
	
	//
	IntStream sequantial = IntStream.rangeClosed(1,100_000_000);  // IntStream.rangeClosed (1,5) 1~5까지의 정수
	
	start = System.currentTimeMillis(); // ?
	total = sequantial.sum(); //??
	end = System.currentTimeMillis();
	System.out.println("순차 처리 : " +(end-start)); // end와 start의 뺀 값을 출력
	
	IntStream parallel= IntStream.rangeClosed(1, 100_000_000).parallel(); //parallel 은 병렬 처리하는것
	start=System.currentTimeMillis();
	total=parallel.sum();
	end=System.currentTimeMillis();
	System.out.println("병렬 처리 : "+(end-start));
	
	
	
	
}
}






