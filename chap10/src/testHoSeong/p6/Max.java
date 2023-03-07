package testHoSeong.p6;

public class Max<T> {

	public T max(T a, T b) {
		// a의 타입이 number면 double타입으로 형변환 시켜서 비교
		if (a instanceof Number) {
			if (((Number) a).doubleValue() > ((Number) b).doubleValue()) {
				return a;
			} else {
				return b;
			}
			// String타입이면 길이를 뽑아내 비교 후 출력
		} else if (((String) a).length() > ((String) b).length()) {
			return a;

		} else {
			return b;
		}

	}

}
