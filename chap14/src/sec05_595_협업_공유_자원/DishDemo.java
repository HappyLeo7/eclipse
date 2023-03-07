package sec05_595_협업_공유_자원;

public class DishDemo {
public static void main(String[] args) {
	final Dish d=new Dish();
	new Thread(new Customer(d)).start();
	new Thread(new Cook(d)).start();
}
}
