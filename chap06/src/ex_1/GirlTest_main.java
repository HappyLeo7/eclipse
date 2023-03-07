package ex_1;

public class GirlTest_main {
	public static void main(String[] args) {
		Girl[] girls = { new Girl("갑순이"), new GoodGirl("콩쥐"), new BestGirl("황진이") };
		for (Girl g : girls) {
			g.show();
		}

//		Girl g1 = new Girl("");
//		Girl g2 = new GoodGirl(null);
//		GoodGirl gg = new BestGirl(null);
//
//		g1.show();
//		g2.show();
//		gg.show();
	}
}
