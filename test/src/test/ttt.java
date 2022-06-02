package test;

import java.util.Scanner;

public class ttt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] ran = new int[10];
		int i=0;
		for(i=0; i<10; i++) {
			ran[i] = (int) (Math.random()*10+1) ;
		}
		
		
		int a = sc.nextInt();
		
		i=0;
		int j=0;
		while(i<10) {
			if (a==ran[i]) {
				j = i+1;
				System.out.println(j+"번");
			}
			i++;
			System.out.println(j);
		}
		
	}

}
