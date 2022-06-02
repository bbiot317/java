package temp;

public class TT2 {

	static int[] change(int a, int b){
		
		int[] l = new int[2];
		l[0]=a;
		l[1]=b;
		int temp = l[0];
		l[0]=l[1];
		l[1]=temp;
		System.out.println(l[0]+","+l[1]);
		return l;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10, b=5;

		int[] c = change(a,b);
		
		System.out.println(c);
		
		
		
		
		
		int[] c= new int[2];
		System.out.println(c);
		System.out.println(a+b);
		addon(a,b);
		System.out.println(a+b);
		
		
	}//m

	
	int rand()
	{
		int a = (int) Math.random()*10;
		return 1;
	}
	static void addon(int x,int y)
	{
		x++; y++;
		System.out.println("addon");
		System.out.println(x);
		System.out.println(y);
	}
}
class TT3{
	
}
