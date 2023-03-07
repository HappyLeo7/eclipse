package sec01_4;

@FunctionalInterface // 함수인터페이스는 아래 int와 double 을 2가지이상쓸수 없기때문에 default와 static을 사용해서 리턴받을수 있다.
public interface Calculate {
	int cal(int a, int b);

	// double cal(double a, double b);
	default int add(int a, int b) {
		return a + b;
	}

	static int sub(int a, int b) {
		return a - b;
	}
}
