package day0314;

import java.util.Scanner;

public class gend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int gender = 1;
		Scanner sc=new Scanner(System.in);
		System.out.println("���Է�");
		
		int gender = sc.nextInt();
		if (gender == 1 || gender == 3){
			System.out.println("man");
		}
		else {
			System.out.println("woman");
		}
		Scanner scorein=new Scanner(System.in);
		System.out.println("���Է�");
		int score = scorein.nextInt();
		if(score >= 90) 
			System.out.println("��");
		else if(score >= 80) {
			System.out.println("��");
		}
		else if(score >= 70) {
			System.out.println("��");
		}
		else if(score >= 60) {
			System.out.println("��");
		}
		if(score >= 60) 
		{System.out.println("�հ�");	}
		else {
			System.out.println("��");
		}
		System.out.println("��");
	}

}