package ex_06;

public class Vehicle {
String color;
int speed;


void show() {
	System.out.println("색상 : "+color);
	System.out.println("속도 : "+speed);
}
public Vehicle(String c, int s) {
	this.color=c;
	this.speed=s;
}

}
