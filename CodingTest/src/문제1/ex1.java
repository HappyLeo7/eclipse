package 문제1;

import java.util.Arrays;

public class ex1 {

	
	
	public static void main(String[] args) {
		
		
//		 Scanner in=new Scanner(System.in);
//		 int m=in.nextInt();
//		System.out.println(m);
int m=5;
		 
		 


		 int[] arr;
		 arr=new int[m];

		for(int i=1; i<=m;i++) {
			if(m%2==1) {
				arr[m/2]='*';
				System.out.println(Arrays.toString(arr));
				if(i==2) {
					System.out.println("a");
					for(int i1=0;i1<=m;i1++) {
					arr[i]=1;
					System.out.println(Arrays.toString(arr));
					}
				
				}if(i==3) {
					arr[i]=2;
				}

			
			
			}	
		}
		
	

			
}
}
//		for(int j=1; j<=m;j++) {
//			System.out.println();

//		}
		
		

