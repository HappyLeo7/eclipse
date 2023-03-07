package sec08_p508수집연산1;

import java.util.IntSummaryStatistics;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import sec01_p479.Nation;

public class Collect1Demo {
	public static void main(String[] args) {

		Stream<Nation> sn = 
				Nation.nations// = List<Nation>이다
				.stream();
		Double avg = sn
				.collect//stream()에 collect라는 매서드가 들어있다.
				(Collectors //Collectors 클래스안에 있는걸 사용 하기위에서 new하지않고 클래스명 후 .을 찍는다
						.averagingDouble(Nation::getPopulation));
		System.out.println("인구 평균 : "+avg);
		
		
		sn=Nation.nations.stream(); // 최종연산 후에는 소모되기때문에 다시 초기값을 준다.
		String name1=sn.limit(4).map(Nation::getName).collect(Collectors.joining("-"));
		System.out.println("4개 나라(방법 1) :" +name1);
		
		sn=Nation.nations.stream(); // 최종연산 후에는 소모되기때문에 다시 초기값을 준다.
		String name2=sn.limit(4).collect(Collectors.mapping(Nation::getName,Collectors.joining("+")));
		System.out.println("4개 나라(방법 2) : "+name2);
		
		sn=Nation.nations.stream(); // 최종연산 후에는 소모되기때문에 다시 초기값을 준다.
		Optional<Double>max=sn.map(Nation::getPopulation).collect(Collectors.maxBy(Double::compare));
		System.out.println("최대 인구 나라의 인구수 : "+max);
		
		sn=Nation.nations.stream(); // 최종연산 후에는 소모되기때문에 다시 초기값을 준다.
		IntSummaryStatistics sta=sn.collect(Collectors.summarizingInt(x->x.getGdpRank()));
				System.out.println(sta);
	
	}
}
