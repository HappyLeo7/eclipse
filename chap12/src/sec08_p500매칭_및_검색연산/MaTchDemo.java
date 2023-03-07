package sec08_p500매칭_및_검색연산;

import java.util.Optional;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec01_p479.Nation;
import sec01_p479.Util;

public class MaTchDemo {

	public static void main(String[] args) {
		boolean b1=
				Stream.of("a1","b2","c3").anyMatch(s->s.startsWith("c"));
		System.out.println(b1);
		
		boolean b2=IntStream.of(10,20,30).allMatch(p->p%3==0);
		System.out.println(b2);
		
		boolean b3=IntStream.of(1,2,3).noneMatch(p->p==3);
		System.out.println(b3);
		
		
		if(Nation.nations.stream().allMatch(d->d.getPopulation()>100.0))System.out.println("모든 국가의 인구가 1억이 넘는다.");
		else System.out.println("모든 국가의 인구가 1억이 넘지 않는다.");
		
		Optional<Nation> nation=Nation.nations.stream().findFirst(); //findFirst 최종 연산
		nation.ifPresentOrElse(Util::Printable,()->System.out.println("없음."));
		System.out.println();
		
		
//		nation=Nation.nations.stream().filter(Nation::isIsland).findAny();
		nation=Nation.nations.stream().filter(x->x.isIsland()).findAny(); //findAnt 병렬처리
		nation.ifPresent(Util::Printable);
	}
	
}
