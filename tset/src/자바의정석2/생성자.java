package 자바의정석2;

public class 생성자 {
	
	public static void main(String[] args) {
		
	Time t	=new Time(); //기본생성자 , 생성자 호출
	t.a=100; // iv 초기화
	t.b=200;
	t.c=300;
	}
}


class Time{
	int a;
	int b;
	int c;
	
	Time(){ // 기본 생성자
		
	}
	
}
