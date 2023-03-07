//package sec02;
//
//import org.jcp.xml.dsig.internal.dom.Utils;
//
//public class Me {
//	public static void main(String[] args) {
//		d = new Mathematical() {
//
//			@Override
//			public double calculate(double d) {
//				// TODO Auto-generated method stub
//				return d;
//			}
//		};
//		m = d -> Math.abs(d);
//		m = Math::abs;
//
//		p = new Pickable() {
//
//			@Override
//			public char pick(String s, int i) {
//				return s.charAt(i);
//			}
//
//		};
//
//		p = (s, i) -> s.charAt(i);
//		p = String::charAt;
//
//		c = new Computable() {
//			@Override
//			public int compute(int x, int y) {
//				return Utils.add(x, y);
//			}
//		};
//		Utils utils = new Utils();
//		c=(x,y)
//		c = utils::add;
//		System.out.println(c.computr(20, 30));
//	}
//}