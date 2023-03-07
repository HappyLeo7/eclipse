package sec04_1;

public class BuildString {
	public static void main(String[] args) {

		StringBuilder stbuf = new StringBuilder("123"); // 기본16공간 + 123 3개추가로 19가됨
		stbuf.append(45678);
		System.out.println(stbuf);
		System.out.println(stbuf.toString());

		stbuf.delete(0, 2); // 삭제할 구간설정
		System.out.println(stbuf);

//		stbuf.insert(0, "AB"); // 해당위치에 추가
		stbuf.replace(0, 2, "AB"); // 교체할 구간 설정후 교체
		System.out.println(stbuf);

		stbuf.reverse(); // 앞뒤 순서 바꾸기
		System.out.println(stbuf);

		String sub = stbuf.substring(2, 4); // 해당위치 구간 뽑아내기
		System.out.println(sub);
		System.out.println(stbuf);

	}
}
