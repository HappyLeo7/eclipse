package sec08_p502루핑과_단순집계;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec01_p479.Nation;
import sec01_p479.Util;

public class LoopAggregateDemo {
public static void main(String[] args) {
	Stream<Nation>sn=Nation.nations.stream() 
			.peek(Util::printWithParenthesis);//peek 중간연산
	System.out.println("어디 나타날까?");
	Optional<Nation>on=sn
			.max(Comparator.comparing(Nation::getPopulation));// max 최종연산
	System.out.println();
	System.out.println(on.get()); //max 로가져온 Nation 하나 반환
	
	System.out.println(IntStream.of(5,1,2,3).min().getAsInt());
	
	sn=Nation.nations.stream();
	System.out.println(sn.count());
}
}
