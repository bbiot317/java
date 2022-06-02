package d0330;

import java.util.Scanner;

public class E15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Q1. chair?");
		
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		int i=0;
		if(a.equals("의자")) {
			System.out.println("정답");
			i++;
		}
		else {
			System.out.println("틀림");
		}
		System.out.println(i);
		
	}

}
