package sec06;

public class AnimalDemo {
	public static void main(String[] args) {

//		Dog dog = new Dog();
//		Cuckoo cuckoo = new Cuckoo();
//		cat cat = new cat();
//		Chick chick = new Chick();
//
//		makeSound(dog);
//		makeSound(cuckoo);
//		makeSound(cat);
//		makeSound(chick);

///////////////////////위아래 같은 코드////////////////////////////		

//		공통인터페이스[] 변수 = {new 클래스(), ....}
		Animal[] animals = { new Dog(), new Cuckoo(), new cat(), new Chick() };
		for (Animal a : animals) {
			a.sound();
			System.out.println();

		}
	}

	private static void makeSound(Animal b) {// 공통되는 Animal 타입을 가져온다
		b.sound();
	}
}
