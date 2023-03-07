package sec08;

public class MyFriends {
	public static void main(String[] args) {

		// 배열로 new 선언
		UnivFriend[] uf = new UnivFriend[5];
		CompFriend[] cf = new CompFriend[5];

		// 첨자선언 0으로
		int ucnt = 0;
		int ccnt = 0;

		uf[ucnt++] = new UnivFriend("김", "컴퓨터공학", "010-1211-2334");
		uf[ucnt++] = new UnivFriend("서", "전기공학", "010-1113-2457");
		uf[ucnt++] = new UnivFriend("장", "경영", "010-6855-2654");
		uf[ucnt++] = new UnivFriend("박", "기계", "010-4468-9687");

		cf[ccnt++] = new CompFriend("강", "경영부서", "02-4951-1111");
		cf[ccnt++] = new CompFriend("천", "마케팅부서", "02-1111-5555");
		cf[ccnt++] = new CompFriend("이", "R&D부서", "02-2222-3333");

		System.out.println("======= 대학 동창 =======");
		for (int i = 0; i < ucnt; i++) {
			uf[i].showInfo();
			System.out.println();
		}

		System.out.println("======= 직장 동료 =======");
		for (int i = 0; i < ccnt; i++) {
			cf[i].showInfo();
			System.out.println();
		}
	}
}
