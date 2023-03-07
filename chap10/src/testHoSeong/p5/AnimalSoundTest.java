package testHoSeong.p5;

import java.util.ArrayList;
import java.util.List;

public class AnimalSoundTest {

	static <T extends Animal> void printSound(List<T> t) {
		// Animal을 상속받는 제네릭타입만 받음, printSound(List<? extends Animal> t)로도 가능 대신 스테틱뒤에
		// 지워야함
		for (T list : t) { // 배열 출력
			list.sound();
		}
	}

	public static void main(String[] args) {

		List<Animal> lists = new ArrayList<>();
		lists.add(new Dog());
		lists.add(new Cuckoo());
		printSound(lists);

		List<Dog> dogs = new ArrayList<>();
		dogs.add(new Dog());
		printSound(dogs);
	}

}
