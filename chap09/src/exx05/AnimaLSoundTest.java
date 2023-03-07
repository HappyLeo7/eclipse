package exx05;

import java.util.ArrayList;
import java.util.List;

//Animal 인터페이서 sound() 매서드 추가
interface Animal {
	void sound();
}

//Dog 클래스 , Cuckoo 클래스 에게 Animal 인터페이스 상속
/////////////////////////////////////////
class Dog implements Animal {

	@Override
	public void sound() {
		System.out.println("멍멍~~");
	}

}

///////////////////////////////////////////
class Cuckoo implements Animal {

	@Override
	public void sound() {
		System.out.println("뻐꾹뻐꾹~~");
	}
}

///////////////////////////////////////////
public class AnimaLSoundTest {
//	 printSound() 매서드 추가
	static <T extends Animal> void printSound(List<T> lists) { //T에 Animal을 상속 시켜야 아래 사운드에서 s에 Animal 타입을 넣지 않아도된다.
		for (T s : lists) {
			(s).sound();
//			((Animal)s).sound(); // 제너릭에 T에 Animal을 상속하지 않으면 s타입에 Anumal을 상속해야함
		}
		;
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
