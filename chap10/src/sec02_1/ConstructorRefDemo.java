package sec02_1;

@FunctionalInterface
interface NewObject<T> {
	T getObject(T o);
}

@FunctionalInterface
interface NewArray<T> {
	T[] getArray(T zise);
}

public interface ConstructorRefDemo {
	public static void main(String[] args) {
		NewObject<String> s;
		NewArray<Integer> i;

		s = new NewObject<String>() {
			@Override
			public String getObject(String o) {
				return new String(o);
			}
		};

		s = o -> new String(o);
		s = String::new;
		System.out.println(s.getObject("Hello!"));

		i = new NewArray<Integer>() {

			@Override
			public Integer[] getArray(Integer zise) {
				return new Integer[zise];
			}
		};

		i = zise -> new Integer[zise];
		i = Integer[]::new;
		Integer[] array = i.getArray(6);
		for (int i1 = 0; i1 < array.length; i1++) {
			array[i1] = i1 * 10;
			array[i1] = (int) (Math.random() * 45);
		}
		for (int k : array) {
			System.out.println(k);
		}

	}
}
