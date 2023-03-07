package sec12;

public class BoundWildcardBase {
	public static void main(String[] args) {
		Box5<Toy> box = new Box5<>();

		Toy toy = new Toy(); // 익명 클래스
		BoxHandler.inBox(box, toy);
		////// 아래 위 같다///////
//		BoxHandler.inBox(box, new Toy());
		System.out.println(box);

		Box5<Robot> rbox = new Box5<>();
//		BoxHandler.inBox(rbox, new Robot());
//		BoxHandler.outBox(rbox);
		BoxHandler.inBox2(box, toy);
	}
}
