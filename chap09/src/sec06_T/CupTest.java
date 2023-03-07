package sec06_T;

public class CupTest {
	public static void main(String[] args) {

//		// 맥주
//		Cup<Beer> beerCup = new Cup<>();
//		beerCup.setCup(new Beer());
//		Beer be1 = beerCup.getCup();
//
//		// 보리차
//		Cup<Boricha> borichaCup = new Cup<>();
//		borichaCup.setCup(new Boricha());
//		Boricha bo1 = borichaCup.getCup();
//
//		Cup<Saida> saidaCup = new Cup<>(); //Cup클래스를 뉴해서 saidaCup 변수에 삽입
//		saidaCup.setCup(new Saida()); //Saida 클래스에 있는 내용을 변수 saidaCup에 저장
//		Saida sa1 = saidaCup.getCup(); // 저장된 saidaCup 내용을 getCup을 이용하여 불러오고 sa1에 삽입
//
//		System.out.println(be1);
//		System.out.println(bo1);
//		System.out.println(sa1);

		Cup<AllCup> Cup = new Cup<>();
		Cup.setCup(new Beer());
		System.out.println(Cup.getCup());

		Cup.setCup(new Boricha());
		System.out.println(Cup.getCup());

		Cup.setCup(new Saida());
		System.out.println(Cup.getCup());

		Cup.setCup(new Cola());
		System.out.println(Cup.getCup());

	}
}
