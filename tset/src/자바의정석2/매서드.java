package 자바의정석2;

public class 매서드 {
int z=0;
	//반환타입 + 매서드이름 + (매개타입 변수, 매개타입 변수){}
	//ex)   String 매서드(String x , String y){}
	int ii(int x, int y) {
		int sum=x+y;
		return sum;
	}
	
	int ip(int x,int y) {
		int ss=x*y;
		return ss;
	}
	int tv(int x,int y) {
		if(x<y) {
			for(int i = x; i<y;i++) {
			int su =x+i;
			 z +=su;
			}
			
		}
		return z;
		
		
	}
	
	int max (int x ,int y) {
//		int maxs=0;
//		if(x>y) {
//			maxs=x;
//		}else {
//			maxs=y;
//		}
//		return maxs;
		
		return x>y ? x:y;
	}
	
	int min(int x, int y) {
		return x<y? x:y;
	}
	
}
