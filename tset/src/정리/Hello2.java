package 정리;

public class Hello2 {  // 여러 클래스를 만들 때는 public은 하나만 쓴다.

//참조형
public static void main(String[] args) {
	

//필드 인스턴스 변수에 값을 넣으려면 객체 생성이 필요

	Tv t=new Tv();
	Tv t1=new Tv();
	
	t.color="블랙";
	t.power=true;
//	boolean t1=t.power();
	System.out.println();
	t.channel=7;
	t.getcup();
	System.out.println(t.channel);
	t.getcup();
	System.out.println(t.channel);
t.getcdown();	
System.out.println(t.channel);
System.out.println(Tv.w);
System.out.println( t.w);
Tv.w=300;
System.out.println( t.w);
System.out.println(t1.w);
System.out.println(Tv.w);
//System.out.println(Tv.w);

//Tv[] q=new Tv[10];  //Tv객체 생성
}}




/////////////////////////////////////////
class Tv{
	
String color;
boolean power;
int channel;

static int w=100;  //클래스 변수이고 메인에서 사용하려면 static을 붙여야한다.
int h=200;

void power() {
	power = !power;   // power 서로 다르면 folse
}

void getcup() {
	channel++;
}

void getcdown() {
	channel--;
}
}
class Hello4{}
class Hello5{}
class Hello6{}
class Hello7{}
class Hello8{}