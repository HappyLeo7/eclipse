package ex03;
//추상클래스
public abstract class CountableClass {   //abstract 추상클래스에 사용

	//필드
	protected String name;
protected int num;

//생성자
public CountableClass(String name, int num) {
	this.name=name;
	this.num=num;
}
abstract void count();
abstract void ripen();
abstract void fly() ;
	

}
