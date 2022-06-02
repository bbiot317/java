package d0422;

public class SuperConMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperConChild scc = new SuperConChild(1,2,4);
		scc.prt();
	}

}

class SuperConParent
{
	private int a;
	private int b;
	SuperConParent(int a,int b)
	{
		System.out.println("SuperConParent");
		this.a = a;
		this.b = b;
	}
	void prt()
	{
		System.out.println("a="+a+b);
	}
	SuperConParent()
	{
		
	}
}
class SuperConChild extends SuperConParent
{
	private int c;
	public SuperConChild(int a, int b, int c)
	{
		super(b,c);
		System.out.println("SuperConChild");
		this.c = c;
	}
	void prt()
	{
		super.prt();
		System.out.println("c="+c);
	
	}
}