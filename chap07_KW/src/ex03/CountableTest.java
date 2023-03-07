package ex03;

public class CountableTest {
public static void main(String[] args) {
	//배열사용
	CountableClass[] m= {new Bird("뻐꾸기",5),new Bird("독수리",2),new Tree("사과나무",10),new Tree("밤나무",7)};
	
	for (CountableClass e:m) {
		e.count();
	}
		for(int i =0; i<m.length;i++) {
			if(m[i] instanceof Bird) {
				m[i].fly();
			}else if(m[i] instanceof Tree){
				m[i].ripen();
			}
		}
	}
}

