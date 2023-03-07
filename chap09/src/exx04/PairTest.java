package exx04;

public class PairTest {
	public static void main(String[] args) {
		Pair<Integer> p1 = new Pair<>(10, 20); // 생성자에 값을 넣었음
		Pair<Double> p2 = new Pair<>(10.0, 20.0);

		System.out.println(p1.first());
		System.out.println(p2.second());
	}
}
