package sec08;

public class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("Gold Wrapping");
	}

	@Override
	public void wrap() {
		System.out.println("3");
	}
}
