package sec04;

public class _197EunmDemo {
	public static void main(String[] args) {

		Gender gender = Gender.FEMALE;
		if (gender == gender.MALE) {
			System.out.println(Gender.MALE + "은 병역 의무가 있다.");
		} else {
			System.out.println(Gender.FEMALE + "은 병역 의무가 없다.");
		}
//	if(gender == Direction.SOUTH)
//		System.out.println(SOUTH+"은(는) 누구?");
//	gender=5;

	}
}

//enum Gender{MALE,FEMALE}
enum Direction {
	EAST, WEST, SOUTH, NORTH
}