package ex_p208_211;

public class _03 {
	public static void main(String[] args) {
//d에 동 서 남 북 들어가게 한다
		for (Direction d : Direction.values())
			System.out.print(d + " ");
	}
}

enum Direction {
	동, 서, 남, 북
}