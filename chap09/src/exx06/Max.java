package exx06;

public class Max<T> {

	public double max(Double a, Double b) {
		return Math.max(a, b);

	}

	public double max(int c, double d) {
		return Math.max(c, d);
	}

	public String max(String s, String s1) {
		int a1 = s.length();
		int a2 = s1.length();
		if (Math.max(a1, a2) == a1) {
			return s;
		} else
			return s1;
	}

}
