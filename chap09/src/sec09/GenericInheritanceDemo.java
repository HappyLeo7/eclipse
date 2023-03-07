package sec09;

import java.util.ArrayList;

import sec06_T.AllCup;
import sec06_T.Beer;

public class GenericInheritanceDemo {
	public static void main(String[] args) {
		ArrayList<AllCup> list1 = new ArrayList<>();
		list1.add(new Beer());
		cupTest(list1);

		ArrayList<Beer> list2 = new ArrayList<>();
		list2.add(new Beer());
//		cupTest(list2);

	}

	private static void cupTest(ArrayList<AllCup> list1) { // Beverage => Allcup 으로 바꿔서 표시했음
//	private static void cupTest(ArrayList<?> list1) {

	}

}
