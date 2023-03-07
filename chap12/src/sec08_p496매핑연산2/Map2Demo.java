package sec08_p496매핑연산2;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import sec01_p479.Nation;
import sec01_p479.Util;

public class Map2Demo {
	public static void main(String[] args) {
		Stream<Nation> n1 = Nation.nations.stream();
		Stream<String> s1 = n1.map(Nation::getName);
		s1.limit(4).forEach(Util::printWithParenthesis);
		System.out.println();

		Stream<Nation> n2 = Nation.nations.stream();
		IntStream iStream = n2.mapToInt(Nation::getGdpRank);
		iStream.forEach(Util::Printable);
	}
}
