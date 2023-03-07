package exx09;

public class Hotel {
//호텔 10개 객실 (1~10호)
	// 필드
//	int num;
//	String name;

//	Hotel aHotel = new Hotel(num, name);
//
//	public Hotel(int num, String name) {
//		this.num = num;
//		this.name = name;
//	}

	class Room {
		int num;
		String name;

		// 생성자

		// 매서드
		Room(int num, String name) {
			this.num = num;
			this.name = name;
		}

		Room[] rooms = new Room[10];

		void add(int num, String name) {
			rooms[num - 1] = new Room(num, name);
		}

	}

	public void add(int num, String name) {
//		this.num = num;
//		this.name = name;

		System.out.println(num + "번 방을 " + name + "가 예약했습니다.");
	}

	void show() {

	}
}
