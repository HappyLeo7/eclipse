package ex_06;

public class Car extends Vehicle{
	int displacement;
	int gears;
	
	void show() {
		System.out.println("색상 : "+color);
		System.out.println("속도 : "+speed);
		System.out.println("배기량 : "+displacement);
		System.out.println("기어 단수 : "+gears);
	}
	
	public Car(String color,int speed, int d, int g) {
super(color,speed);
this.displacement=d;
this.gears=g;

}
}
