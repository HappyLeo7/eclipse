package sec01_5;

@FunctionalInterface // 함수형 인터페이스
public interface GeCalculate<T> {
	T cal(T a, T b);
}
