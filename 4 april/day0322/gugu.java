package day0322;

import java.util.Scanner;

public class gugu {

	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		System.out.println("���� : ");
//		Scanner df = new Scanner(System.in);
//		int b = df.nextInt();
//				
		int i = 0; //1
		int j = 0;
		for (i = 2; i<=9; i++){
			for (j = 1; j<=9; j++) {
				System.out.printf(i+"*"+j+"="+j*i+"\t");
			}
			System.out.println();
		}
		System.out.println();
		for (i = 1; i<=9; i++){
			for (j = 2; j<=9; j++) {
				System.out.printf(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
