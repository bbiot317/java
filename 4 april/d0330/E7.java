package d0330;

import java.util.Scanner;

public class E7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner sc = new Scanner(System.in);
//		int[] ran = new int[10];
//		int i=0;
//		for(i=0; i<10; i++) {
//			ran[i] = (int) (Math.random()*10+1) ;
//			System.out.println(ran[i]);
//		}
//		
//		int a = sc.nextInt();
//		i=0;
//		while(i<10) {
//			if (a==ran[i]) {
//				System.out.println(i+1+"번");
//			}
//			i++;
//		}
		// Math.랜덤  
//		 0.0 <= Math.random() <1.0 ;
//		 0 <= Math.random()*10 < 10 ;
//		 5 <= (int) (Math.random()*10)+5 < 15 ;
		 
		//7-1
		
		
		int[] se = new int[45];
		int[] sf = se;
		
		
		
		
		int i =0;
		while(i<45) {
			se[i]=i+1;
			i++;
		}
		i=0;
		int temp0=0;
		int temp1=0;
		int temp2=0;
		while(i<65) {
			
			temp0 = (int) (Math.random()*45);
			temp1 = (int) (Math.random()*45);
			temp2 = se[temp0]; 
			se[temp0] = se[temp1];
			se[temp1] = temp2;
			i++;			
		}
		i=0;
		while(i<se.length) {
			System.out.println("se["+i+"] ="+se[i]);
			i++;
		}
		
		
		
	}

}
