package sec07;

public class Entry<K, V> {
	// 필드
	private K key;
	private V value;

	// 생성자
	public Entry(K key, V value) { // 생성자는 this 지정
		this.key = key;
		this.value = value;

	}

	public K getKey() {
		return key;
	}

	public V getvalue() {
		return value;
	}

}
