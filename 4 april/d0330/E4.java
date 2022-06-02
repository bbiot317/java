package d0330;

import java.util.Scanner;

public class E4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int a=0;
//		int[] l = new int[5];
//		Scanner sc= new Scanner(System.in);
//		while(a<5) {
//			l[a] = sc.nextInt();
//			a++;			
//		}
//		//4-1
//		a=l[1];
//		l[0] = l[1];
//		l[1]=a;
		//5
		Scanner sc= new Scanner(System.in);
		int a=0;
		int[] t = new int[10];
		while(a<10) {
			t[a]= sc.nextInt();
			a++;
		}
		
		int i,b,s,bi,si;
		i=bi=si=0;
		b=s=t[0];
		while(i<10) {
			if(s>t[i]) {
				s=t[i]; si=i;      
			}
			else if(b<t[i]) {
				b=t[i]; bi=i;
			}
		i++;	
		}
		System.out.printf("작은%d,%d번째  큰%d,%d번째",s,si+1,b,bi+1);
		
        
		
		
	}

}
