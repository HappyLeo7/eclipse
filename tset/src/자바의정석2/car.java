package 자바의정석2;

public class car {
	
	int num;
	String color;

	public car(){
		
	}
	
public car(String c) {
	this.color=c;
	this.num=1000;
//	return ;
}
//public car(int n) {
//	this.color="ddd";
//	this.num=n;
//	return ;
//	
//}
//public car(String c,int n) {
//	this.color=c;
//	this.num=n;
//	return ;
//}


void getcar() {
	System.out.println(color+" : "+num);
}

}
