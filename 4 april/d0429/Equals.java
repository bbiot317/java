package d0429;

import java.util.Scanner;

public class Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		et t1 = new et();
		et t2 = new et();
		t2 = t1;
		System.out.println(t1.equals(t2));
		t1.x = 1;
		t2.x = 1;
		System.out.println(t1==t2);
		System.out.println(t1.toString());
		String s1 = "fdsa";
		s1.equals(s1);
		
	}	

}



class et
{
	private int ad;
	private int af;
	
	int x;
  
	
	
	public boolean equals(Object b)
	{
		boolean ret;
		if (b instanceof et)
			return false;
//			return (( (et) b ).x==this.x);
		else
//			return true;
			return super.equals(b);
		
	}
	

	public String toString()
	{
		
		return "overided method";
	}
	  
}