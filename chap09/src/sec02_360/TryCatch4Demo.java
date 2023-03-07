package sec02_360;

public class TryCatch4Demo {
	public static void main(String[] args) {

		Reso reso = new Reso();
////////////////////////////////////////////////////////////////////////////
		try (reso) { //
			reso.show(); //
		} catch (Exception e) { //
			System.out.println("예외처리"); //
		} //
////위아래 코드 같다 아래는 길어서 위와같이 씀 try 뒤에 갈호가 들어가면서 ////////////////////
//		try  {
//			reso.show();
//		} catch (Exception e) {
//			System.out.println("예외처리");
//		}finally {
//			try {
//				reso.close();
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
///////////////////////////////////////////////////////////////////////////
	}
}

class Reso implements AutoCloseable {
	void show() {
		System.out.println("자원 사용");
	}

	public void close() throws Exception {
		System.out.println("자원 닫긴");
	}
}
