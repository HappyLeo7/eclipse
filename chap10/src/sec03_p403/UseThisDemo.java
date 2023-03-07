package sec03_p403;

@FunctionalInterface
interface UseThis {
	void use();
}

public class UseThisDemo {
	public void lambda() {
		String hi = "Hi!";

		UseThis u1 = new UseThis() {

			@Override
			public void use() {
				System.out.println(this);
//				hi="innerr.."; // hi를 인식 못한다..
			}
		};
		u1.use();

		UseThis u2 = () -> System.out.println(this);
		u2.use();
	}

	public String toString() {
		return "UsethisDemo";
	}

	public static void main(String[] args) {
////////////////////////////////////////////////////////
		int one = 1;
		new UseThisDemo().lambda();
////////////////////////////////////////////////////////		
	}
}
