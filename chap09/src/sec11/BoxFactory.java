package sec11;

public class BoxFactory {
	public <T> Box<T> makeBox(T o) {
		Box<T> box = new Box<>();
		box.set(o);
		return box;
	}
}
