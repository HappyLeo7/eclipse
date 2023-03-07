package sec08_p504집계연산1;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

import sec01_p479.Util;

public class Reduce1Demo {
public static void main(String[] args) {
	//List<T> 변수 = List.of( ~ );
	List<Integer> numbers=List.of(3,4,5,1,2);
	
	//reduce를 이용한 연산 
	int sum1 =numbers
			         .stream()
			         .reduce(0,(a,b)->a+b);
	int sum2=numbers
					.stream()
					.reduce(0, Integer::sum);
	int mul1=numbers
					.stream()
					.reduce(1, (a,b)->a*b);

	System.out.println(sum1);
	System.out.println(sum2);
	System.out.println(mul1);
	
	Optional<Integer>sum3=numbers
								 .stream()
								 .reduce(Integer::sum);
	
	OptionalInt sum4=numbers
							.stream()
							.mapToInt(x->x.intValue())
							.reduce(Integer::sum);
	
	Optional<Integer>mul2=numbers
								 .stream()
								 .reduce((a,b)->a*b);
	
	System.out.println(sum3.get());
	System.out.println(sum4.getAsInt());mul2.ifPresent(Util::Printable);
			
}}