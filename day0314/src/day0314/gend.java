package day0314;

import java.util.Scanner;

public class gend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int gender = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("성입력");
		
		int gender = sc.nextInt();
		if (gender == 1 || gender == 3){
			System.out.println("man");
		}
		else {
			System.out.println("woman");
		}
		Scanner scorein=new Scanner(System.in);
		System.out.println("점입력");
		int score = scorein.nextInt();
		if(score >= 90) 
			System.out.println("수");
		else if(score >= 80) {
			System.out.println("우");
		}
		else if(score >= 70) {
			System.out.println("미");
		}
		else if(score >= 60) {
			System.out.println("양");
		}
		if(score >= 60) 
		{System.out.println("합격");	}
		else {
			System.out.println("불");
		}
		System.out.println("종");
	}

}