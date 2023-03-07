package 자바의정석2;
 
class Dat{int x;}

public class 참조형_매개변수 {
	public static void main(String[] args) {
		
	Dat d=new Dat();
	d.x=10;
	System.out.println(d.x);
	
	change(d);
	change1(d.x);
	
	System.out.println("d:"+d);
	}
static void change(Dat d) { // 타입에 따라서 기본형(int,double등) 변수 일땐 읽기만 가능 하지만 별도의 타입인(Dat 클래스) 참조변수를 가지고오면 참조형 변수로 읽기 쓰기가 가능 
	d.x=1000;
System.out.println(d.x);
return; // void라서 자동 리턴해준다.
}
static void change1(int x) {
	x=100;
	System.out.println("x:"+x);
}
}



