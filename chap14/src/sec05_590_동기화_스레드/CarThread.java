package sec05_590_동기화_스레드;

public class CarThread extends Thread{
	
	//필드 선언 3개의 매개변수
	private String who;
	private SharedCar car;
	private String where;
	
	//
	public CarThread(String w,SharedCar c,String wh) {
		this.who=w;
		this.car=c;
		this.where=wh;
	}
	
	public void run() {
		car.drive(who, where);
	}
	

}
