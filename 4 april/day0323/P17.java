package day0323;

public class P17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numb= new int[6];
		for(int a=0;a<6;a++) {
			numb[a] = 1;
			System.out.println(numb[a]);
		}
		
		
		
		int[] number= new int[6];
		for(int a=0;a<6;a++) {
			number[a] = 1+a;
			System.out.println(number[a]);
		}
		
		
		int[] num=new int[5];
		num[0]=1;
		for(int a=1;a<5;a++) {
			
			num[a]= num[a-1]* 10;
			System.out.println(num[a]);
		}
		
			

	}

}
