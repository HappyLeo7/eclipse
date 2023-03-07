package exx02_O;

//인터페이스 추가

interface Wordable {
	void word();
}

///////////////////////////main//////////////////////////////
public class WordableTest {
public static void main(String[] args) {
	//배열
	
	
	Wordable[] m= {
			()->System.out.println("가위"),
			()->System.out.println("나비"),
			()->System.out.println("다리"),
			()->System.out.println("마차")
			//필요한 코드
	};
	

	//반복문
for(Wordable l:m) {
l.word();	
}
}
}

/////////////////////////////////////////////////////////////
