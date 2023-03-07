package 연속된_수의_합;

public class num {
public static void main(String[] args) {
	int num=3 ;
	for(int i=0; i<3; i++) {
		System.out.println(num);
		System.out.println(i);
		num = num+i;
		System.out.println(num);
		System.out.println("띄어쓰기");
	}
}
}
