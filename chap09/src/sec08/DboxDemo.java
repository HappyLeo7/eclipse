package sec08;

public class DboxDemo {
	public static void main(String[] args) {

		DBox<String, Integer> box = new DBox<>();
		box.set("Apple", 30); // 오토 박싱
		System.out.println(box); // toString()에서 오토 언박싱

	}
}
