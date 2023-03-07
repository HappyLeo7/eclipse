package exx06_o;

import java.util.function.Supplier;

public class AnimalTest {
Supplier<Animal> s;
	 static void soundAnimal(Supplier<Animal> s) {
		Animal an=  s.get();
		an.sound();
	}

	public static void main(String[] args) {
soundAnimal ( ()-> new Animal());		
soundAnimal ( ()-> new Dog());		
//		Supplier<String> ii=()->dog.sound();
//		System.out.println(ii.get());
		
	}
}
