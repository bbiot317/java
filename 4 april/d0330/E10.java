package d0330;

import java.util.ArrayList;
import java.util.Scanner;

public class E10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();

		int d=100000;
		ArrayList<Integer> list = new ArrayList();
		while(d>1) {
			d/=2;
			list.add(d);
			d/=5;
			list.add(d);
		}
		int i=0;
		int g=0;
		while(i<list.size()) {
			g = m / list.get(i);
			System.out.print(list.get(i)+"원 "+g+"개, ");
			m %= list.get(i);
			i++;
		}
		
		
	}

}
