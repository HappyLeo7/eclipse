package Sec02;

public class Switch03 {

	public static void main(String[] args) {

		whoIsIt("호랑이");
		whoIsIt("참새");
		whoIsIt("고등어");
		whoIsIt("곰팡이");
	}

	static void whoIsIt(String bio) {

		// 1
//		String kind = switch (bio) {
//		case "호랑이", "사자":
//			yield "포유류";
//		case "독수리", "참새":
//			yield "조류";
//		case "고등어", "연어":
//			yield "어류";
//		default:
//			System.out.print("어이쿠!");
//			yield "...";
//		};

		// 2
		// String kind = "";
//
//		switch (bio) {
//		case "호랑이", "사자" -> kind = "포유류";
//
//		case "독수리", "참새" -> kind = "조류";
//
//		case "고등어", "연어" -> kind = "어류";
//
//		default -> {
//			System.out.print("어이쿠!");

//			kind = "...";

		// 3
		String kind = switch (bio) {
		case "호랑이", "사자" -> "포유류";

		case "독수리", "참새" -> "조류";

		case "고등어", "연어" -> "어류";

		default -> "어이쿠! ...";

		};

		System.out.printf("%s는 %s는 이다.\n", bio, kind);
	}
}
