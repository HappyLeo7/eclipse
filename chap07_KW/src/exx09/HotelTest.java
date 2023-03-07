package exx09;

public class HotelTest {
	public static void main(String[] args) {
		Hotel hotel = new Hotel();
//		Room hotel = new Room();
		hotel.add(5, "호돌이");
		hotel.add(7, "길동이");
		hotel.add(10, "동이");
		hotel.add(1, "길이");
		hotel.show();
	}
}
