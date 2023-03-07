package ex_05;

public class PhoneTest {
	public static void main(String[] args) {
		Phone[] ph = { new Phone("황진이"), new Telephone("길동이", "내일"), new Smartphone("민국이", "갤러그") };

//for(Phone p :ph) {
//	if(p instanceof Phone) {
//		p.talk();
//	}else
//	if(p instanceof Telephone) {
//		((Telephone) p).autoAnswering();
//		}
//	else if(p instanceof Smartphone) {
//		((Smartphone) p).playGamem();
//	}

		for (Phone p : ph) {
			if (p instanceof Smartphone) {
				((Smartphone) p).playGamem();
			}

			else if (p instanceof Telephone) {
				((Telephone) p).autoAnswering();
			} else if (p instanceof Phone) {
				p.talk();
			}

		}
	}
}