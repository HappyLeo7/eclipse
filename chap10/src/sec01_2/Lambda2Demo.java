package sec01_2;

public class Lambda2Demo {
	public static void main(String[] args) {
		Negative n;
		Printable p;
//1
		n = (int x) -> {
			return -x;
		};
//2
		n = new Negative() {
			@Override
			public int neg(int x) {
				return -x;
			}
		};
//3
		n = (x) -> {
			return -x;
		};
//4
		n = x -> {
			return -x;
		};
//5
		n = (x) -> -x;
//6
		n = x -> -x;

		p = new Printable() {

			@Override
			public void print() {
				System.out.println("Hi~~");
			}
		};

		p = () -> {
			System.out.println("Hi!!");
		};

	}

}
