package test;

import java.util.Scanner;
public class Page21 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner faew = new Scanner(System.in);
		System.out.printf("¼Ò¹®ÀÚ : ");
		
		char lower = faew.next().charAt(0);
		char upper = (char) (lower-32);
		System.out.println(upper);
				
		
		String str = faew.next();//"ko"
		char ch = str.charAt(0);//
		System.out.println((char)(ch-32));
	}

}
