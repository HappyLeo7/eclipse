package sec04;

public class _199EnumDemo {

	public static void main(String[] args) {
		Gender1 gender = Gender1.FEMALE;
		if (gender == Gender1.MALE) {
			System.out.println(Gender1.MALE + "은 병역 의무가 있다.");
		} else {
			System.out.println(Gender1.FEMALE + "은 병역 의무가 없다.");
		}
		for (Gender1 g : Gender1.values()) {
			System.out.println(g.name());
		}
		System.out.println(Gender1.valueOf("MALE"));
		System.out.println(gender);

		Gender1 gender2 = Gender1.MALE;

		System.out.println(gender2);
	}

}
