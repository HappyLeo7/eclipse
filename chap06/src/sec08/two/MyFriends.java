package sec08.two;

public class MyFriends {
	public static void main(String[] args) {

		// 배열로 new 선언
//		UnivFriend[] uf = new UnivFriend[5];
//		CompFriend[] cf = new CompFriend[5];
		Friend[] ff = new Friend[10];

		// 첨자선언 0으로
//		int ucnt = 0;
//		int ccnt = 0;
		int fcnt = 0;
//		ff[fcnt++] = new Friend("김", "김", "010");
		ff[fcnt++] = new UnivFriend("김", "컴퓨터공학", "010-1211-2334");
		ff[fcnt++] = new CompFriend("천", "마케팅부서", "02-1111-5555");
		ff[fcnt++] = new UnivFriend("서", "전기공학", "010-1113-2457");
		ff[fcnt++] = new UnivFriend("장", "경영학과", "010-6855-2654");
		ff[fcnt++] = new UnivFriend("박", "기계학과", "010-4468-9687");
//
		ff[fcnt++] = new CompFriend("강", "경영부서", "02-4951-1111");
		ff[fcnt++] = new CompFriend("이", "R&D부서", "02-2222-3333");
		int sw = 0;
		System.out.println("======= 대학 동창 =======");
		for (int i = 0; i < fcnt; i++) {
			if (ff[i] instanceof UnivFriend) {
				ff[i].showInfo();
				System.out.println();
			}
		}
		System.out.println("======= 직장 동창 =======");
		for (int i = 0; i < fcnt; i++) {
			if (ff[i] instanceof CompFriend) {
				ff[i].showInfo();
				System.out.println();
			}
		}
//		for (int i = 0; i < fcnt; i++) {
//			if (ff[i] instanceof UnivFriend && sw == 0) {
//				System.out.println("======= 대학 동창 =======");
//				sw = 1;
//			}
//			if (ff[i] instanceof CompFriend && sw == 1) {
//				System.out.println("======= 직장 동창 =======");
//				sw += 1;
//			}
//			ff[i].showInfo();
//			System.out.println();
//		}
	}

//		System.out.println("======= 직장 동료 =======");
//		for (int i = 0; i < fcnt; i++) {
//			ff[i].showInfo();
//			System.out.println();
//		}
}
