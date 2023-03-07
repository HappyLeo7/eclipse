package sec03_직렬화;

import java.io.Serializable;

public class SBox implements Serializable{ // Serializable 인터페이스 상속
	
	String s; //필드
	
	transient String pw; //transient 는  직렬화 할때 제외하는 키워드
	
	public SBox(String s, String pw) { //생성자
		this.s=s;
		this.pw=pw;
		
	}
	public String get() { //get 
		return s+", "+pw;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
