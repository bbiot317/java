package test;

import java.util.Scanner;

public class Page33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ff=new Scanner(System.in);
		
		int a = ff.nextInt();
		
		String j = a >= 90 ? "A" : a >= 80 ? "B" : a>=70 ? "c" : a>=60 ? "d" : "f"; 
		System.out.println(j);
	
	
	
	}

}
