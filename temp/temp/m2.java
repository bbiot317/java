package temp;


	
	
public class m2{
	static int add(int a,int b)
	{
	int c;
	c= a+b;
	return c;
	}
	
	static int ret()
	{
		int x=10;
		return x;
	}
	
	static void noret(int x)
	{
		System.out.println("x=" +x);
	}
	static void prt()
	{
		System.out.println("전");
		return;
		System.out.println("gg");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a, b;
		a = b = 4;
		 ret();
		prt();
		add(a,b);
		noret(b);
	}
	
	
}//m2
	
	
	
	



