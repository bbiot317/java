package d0330;

import java.util.Scanner;

public class E16 {
	
	static int Q=1;
	static void ana(String a)
	{
		
		char[]tv = a.toCharArray();
		for(int o=0; o<55; o++) {
			int rr = (int) (Math.random()*a.length());
			int r2 = (int) (Math.random()*a.length());
			char temp = ' ';
			temp = tv[rr];
			tv[rr]=tv[r2];
			tv[r2]=temp;
		}
		String b="";
		for(int o=0; o<a.length(); o++) {
			b += tv[o];
		}
		System.out.print("Q"+Q+". "+b+"의 정답 > ");
		Scanner sc = new Scanner(System.in);
		b = sc.next();
		System.out.println((b.equals(a)? "ㅇ" : "ㄴ"));
		Q++;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a = "television";
		ana(a);  
		String b = "computer";
		ana(b);	 	
		String c = "mouse";
		ana(c);  
		String d = "phone";
		ana(d);  
		
		

	}

}
