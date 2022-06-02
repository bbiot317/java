package test;
import java.util.Scanner;
public class Page40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner fdas= new Scanner(System.in);
		System.out.println("국어 점수 ? :");
		int a = fdas.nextInt();
		System.out.println("영어 점수 ? :");
		int b = fdas.nextInt();
		System.out.println("수학 점수 ? :");
		int c = fdas.nextInt();
		System.out.println("과학 점수 ? :");
		int d = fdas.nextInt();
		System.out.println("음악 점수 ? :");
		int e = fdas.nextInt();
System.out.println("합계는 "+(a+b+c+d+e)+"이다");
System.out.println("평균은 "+(a+b+c+d+e)/5);
	
	}

}
